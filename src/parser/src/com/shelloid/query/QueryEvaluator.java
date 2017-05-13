/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shelloid.query;

import com.shelloid.query.vo.ShelloidScript;
import com.shelloid.query.vo.ArithExpr;
import com.shelloid.query.vo.BooleanExpr;
import com.shelloid.query.vo.Literal;
import com.shelloid.query.vo.NamedValue;
import com.shelloid.query.vo.QualifiedName;
import com.shelloid.query.vo.RelationalExpr;
import com.shelloid.query.vo.SelectTerm;
import com.shelloid.query.vo.ShelloidQuery;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Jayaraj Poroor
 */
public class QueryEvaluator {
    public static final int SELECT_CLAUSE = 0;
    public static final int WHERE_CLAUSE = 1;
    public static final int ACTION_CLAUSE = 2;
    
    int state = -1;
    HashMap<String, Object> env = new HashMap<>();    
    ShelloidQuery query;
    EvaluationCallback ecb;
    HashMap<String, Literal> resultMap;
    boolean memoize = true;
    public QueryEvaluator()
    {                
    }
    
    public void init(ShelloidQuery query, EvaluationCallback ecb) throws EvaluationException
    {
        this.env.clear();
        commonInit(query, ecb);
        if(query.letClause != null)
        {
            Iterator<String> it = query.letClause.map.keySet().iterator();
            while(it.hasNext())
            {
                String name = it.next();
                env.put(name, evaluateLiteral(query.letClause.map.get(name)));
            }
        }
    }
    
    public void init(ShelloidQuery query, HashMap<String, Object> initEnv, EvaluationCallback ecb)
    {
        this.env = (HashMap<String,Object>) initEnv.clone();
        commonInit(query, ecb);
    }
    
    void commonInit(ShelloidQuery query, EvaluationCallback ecb)
    {
        resultMap = new HashMap<>();                
        this.query = query;
        this.ecb = ecb;
        this.state = -1;
        this.memoize = true;                
    }
    
    public void setMemoize(boolean memoize)
    {
        this.memoize = memoize;
    }
    
    public HashMap<String, Object> getEnv()
    {
        return env;
    }
    
    public HashMap<String, Literal> getResult()
    {
        return resultMap;
    }    
    
    public int getState()
    {
        return state;
    }
        
    public void evaluateQuery() throws EvaluationException
    {        
        state = WHERE_CLAUSE;
        if(evaluateWhereClause())
        {
            state = SELECT_CLAUSE;
            evaluateSelectClause();
            state = ACTION_CLAUSE;
            if(query.actionClause != null){
                invokeActions(query.actionClause);
            }
        }
    }
    
    public void invokeActions(ShelloidScript actionClause) throws EvaluationException
    {
        boolean oldMemoize = memoize;
        memoize = false;
        ArithExpr []actions = actionClause.actions;
        for(int i=0;i< actions.length;i++)
        {
            evaluateArithExpr(actions[i]);
        }
        memoize = oldMemoize;
    }
    
    public void evaluateSelectClause() throws EvaluationException
    {
        if(query.selectClause != null)
        {
            SelectTerm[] terms = query.selectClause.selectTerms;
            for(int i=0;i<terms.length;i++)
            {
                evaluateSelectTerm(terms[i]);
            }
        }
    }
    
    public void evaluateSelectTerm(SelectTerm term) throws EvaluationException
    {
        switch(term.kind)
        {
            case SelectTerm.ATTRIBUTE:
                evaluateNameWithResult(term.name, true);
                break;
            case SelectTerm.FUNCTION_CALL:
                evaluateSelectTermFunction(term);
                break;
            default:
                throw new EvaluationException("Unknown SELECT term kind: " + term.kind, term.src);
        }
    }
    
    public void evaluateSelectTermFunction(SelectTerm term) throws EvaluationException
    {
        assert(term.kind == SelectTerm.FUNCTION_CALL);
        Object [] params = new Object[term.params.length];
        StringBuilder buf = null;
        String key = null;
        Object value = null;
        if(memoize)
        {
            buf = new StringBuilder();
            buf.append(term.name.components[0]);
            buf.append("(");
        }
        for(int i=0;i<term.params.length;i++)
        {
            params[i] = evaluateName(term.params[i]);
            if(memoize)
            {
                if(i > 0)
                {
                    buf.append(",");
                }
                buf.append(params[i].toString());
            }
        }
        if(memoize)
        {
            buf.append(")");
            key = buf.toString();
            value = env.get(key);
        }
        if(value == null)
        {
            try
            {
                value = ecb.invoke(term.name.components[0], params);
            }catch(Exception e)
            {
                throw new EvaluationException(e.getMessage(), term.src, e);
            }
        }
        if(value != null)
        {
            Literal literal = objectToLiteral(value);
            resultMap.put(key, literal);
            if(memoize){
                env.put(key, value);
            }
        }
    }
    
    public boolean evaluateWhereClause() throws EvaluationException
    {
        if(query.whereClause != null)
            return evaluateBooleanExpr(query.whereClause.expr);
        else
            return true;
    }
    
    public boolean evaluateBooleanExpr(BooleanExpr expr) throws EvaluationException
    {
        assert(expr != null);
        switch(expr.kind)
        {
            case BooleanExpr.REL_EXPR: 
                return evaluateRelationalExpr(expr.relExpr);
            case BooleanExpr.AND:
                return evaluateBooleanExpr(expr.lExpr) && evaluateBooleanExpr(expr.rExpr);
            case BooleanExpr.OR:
                return evaluateBooleanExpr(expr.lExpr) || evaluateBooleanExpr(expr.rExpr);
            case BooleanExpr.NOT:
                return !evaluateBooleanExpr(expr.lExpr);
            default:
                throw new EvaluationException("Unknown boolean expression kind: " + expr.kind, expr.src);
                
        }
    }
    
    public boolean evaluateRelationalExpr(RelationalExpr expr) throws EvaluationException
    {
        assert(expr != null);
        Object lVal = evaluateArithExpr(expr.lExpr);
        Object rVal = evaluateArithExpr(expr.rExpr);
        if (lVal instanceof Number && rVal instanceof Number) {
            if (lVal instanceof Long && rVal instanceof Long) {
                long m = (Long) lVal;
                long n = (Long) rVal;
                switch (expr.kind) {
                    case RelationalExpr.GT:
                        return m > n;
                    case RelationalExpr.LT:
                        return m < n;
                    case RelationalExpr.LTE:
                        return m <= n;
                    case RelationalExpr.GTE:
                        return m >= n;
                    case RelationalExpr.EQ:
                        return m == n;
                    case RelationalExpr.NEQ:
                        return m != n;
                    default:
                        throw new EvaluationException("Unknown Relational Expr kind: " + expr.kind, expr.src);
                }
            } else {
                double m = ((Number) lVal).doubleValue();
                double n = ((Number) rVal).doubleValue();
                switch (expr.kind) {
                    case RelationalExpr.GT:
                        return m > n;
                    case RelationalExpr.LT:
                        return m < n;
                    case RelationalExpr.LTE:
                        return m <= n;
                    case RelationalExpr.GTE:
                        return m >= n;
                    case RelationalExpr.EQ:
                        return m == n;
                    case RelationalExpr.NEQ:
                        return m != n;
                    default:
                        throw new EvaluationException("Unknown Relational Expr kind: " + expr.kind, expr.src);
                }

            }
        } else
        if(lVal instanceof String || rVal instanceof String)
        {
            switch(expr.kind)
            {
                case RelationalExpr.EQ:
                    return lVal.toString().equals(rVal.toString());
                case RelationalExpr.NEQ:
                    return !lVal.toString().equals(rVal.toString());
                default:
                   throw new EvaluationException("Unsupported relational expression on string: " + expr.kind, expr.src);
            }
        }else
        {
            throw new EvaluationException("Unsupported Relational Expr kind: " + expr.kind, expr.src);
        }
    }
    
    public Object evaluateArithExpr(ArithExpr expr) throws EvaluationException
    {
        switch(expr.kind)
        {
            case ArithExpr.LITERAL:
                return evaluateLiteral(expr.literal);
            case ArithExpr.NAME:
                return evaluateName(expr.name);
            case ArithExpr.FUNCTION_CALL:
                return evaluateFunctionCall(expr);
            default:
                return evaluateArithOp(expr);
        }
    }
    
    public Object evaluateArithOp(ArithExpr expr) throws EvaluationException
    {
        assert(expr.subExprs[0].arithExpr != null);
        assert(expr.subExprs[1].arithExpr != null);
        Object lVal = evaluateArithExpr(expr.subExprs[0].arithExpr);
        if(lVal instanceof NamedValue){
            lVal = ((NamedValue) lVal).value;
        }
        Object rVal = null;
        if(expr.subExprs.length > 1)
        {
            rVal = evaluateArithExpr(expr.subExprs[1].arithExpr);
            if(rVal instanceof NamedValue){
                rVal = ((NamedValue) rVal).value;            
            }
        }
        if (lVal instanceof Number && rVal instanceof Number) {
            if (lVal instanceof Long && rVal instanceof Long) {
                long m = (Long) lVal;
                long n = (Long) rVal;
                switch (expr.kind) {
                    case ArithExpr.ADD:
                        return m + n;
                    case ArithExpr.SUB:
                        return m - n;
                    case ArithExpr.DIV:
                        return m / n;
                    case ArithExpr.MUL:
                        return m * n;
                    case ArithExpr.MOD:
                        return m % n;
                    default:
                        throw new EvaluationException("Unknown integer arithmetic expression kind: " + expr.kind, expr.src);
                }
            } else {
                double m = ((Number) lVal).doubleValue();
                double n = ((Number) rVal).doubleValue();
                switch (expr.kind) {
                    case ArithExpr.ADD:
                        return m + n;
                    case ArithExpr.SUB:
                        return m - n;
                    case ArithExpr.DIV:
                        return m / n;
                    case ArithExpr.MUL:
                        return m * n;
                    case ArithExpr.MOD:
                        return m % n;
                    default:
                        throw new EvaluationException("Unknown double arithmetic expression kind: " + expr.kind, expr.src);
                }
            }
        } 
        else
        if(lVal instanceof String || rVal instanceof String)
        {
            switch(expr.kind)
            {
                case ArithExpr.ADD:
                    return lVal.toString() + rVal.toString();
                default:
                   throw new EvaluationException("Unsupported operator on string: " + expr.kind, expr.src);
            }
        }else
        {
            throw new EvaluationException("Unsupported Arithmetic Expr kind: " + expr.kind, expr.src);
        }
        
    }
    
    public Object evaluateName(QualifiedName name) throws EvaluationException
    {
        return evaluateNameWithResult(name, false);
    }
        
    public Object evaluateNameWithResult(QualifiedName name, boolean fillResult) throws EvaluationException
    {
        String dotname = name.toString();
        Object val = env.get(dotname);
        if(val == null)
        {
            try{
                val = ecb.read(name);
            }catch(Exception e)
            {
                throw new EvaluationException(e.getMessage(), name.src, e);
            }
            
        }
        
        if (val != null) {
            NamedValue nv = new NamedValue(name, val);
            env.put(dotname, nv);
            if (fillResult) {
                Literal literal = objectToLiteral(val);
                resultMap.put(dotname, literal);
            }
        }
        
        return val;        
    }
    
    public Literal objectToLiteral(Object val)
    {
        if(val instanceof NamedValue)
            val = ((NamedValue)val).value;
        Literal literal = new Literal();
        if(val instanceof Long || val instanceof Integer)
        {
            literal.kind = Literal.LONG;
            literal.lVal = ((Number) val).longValue();
        }else
        if(val instanceof Double || val instanceof Float)
        {
            literal.kind = Literal.DOUBLE;
            literal.dVal = ((Number) val).doubleValue();
        }
        if(val instanceof Boolean)
        {
            literal.kind = Literal.BOOLEAN;
            literal.bVal = ((Boolean)val).booleanValue();
        }
        else        
        {
            literal.kind = Literal.STRING;
            literal.sVal = val.toString();
        }
        return literal; 
    }
        
    public Object evaluateFunctionCall(ArithExpr expr) throws EvaluationException
    {
        assert(expr.kind == ArithExpr.FUNCTION_CALL);
        Object [] params = new Object[expr.subExprs.length];
        StringBuilder buf = null;
        String key = null;
        Object value = null;
        if(memoize)
        {
            buf = new StringBuilder();
            buf.append(expr.name.components[0]);
            buf.append("(");
        }
        for(int i=0;i<expr.subExprs.length;i++)
        {
            if(expr.subExprs[i].arithExpr != null){
                params[i] = evaluateArithExpr(expr.subExprs[i].arithExpr);
            }else
            if(expr.subExprs[i].booleanExpr != null){
                params[i] = evaluateBooleanExpr(expr.subExprs[i].booleanExpr);
            }
            if(memoize)
            {
                if(i > 0)
                {
                    buf.append(",");
                }
                if(params[i] instanceof String)
                {
                    buf.append("'");
                    buf.append((String)params[i]);
                    buf.append("'");
                }else
                {
                    buf.append(params[i].toString());
                }
            }
        }
        if(memoize)
        {
            buf.append(")");
            key = buf.toString();
            value = env.get(key);
        }
        if(value == null)
        {
            try{
                value = ecb.invoke(expr.name.components[0], params);
            }catch(Exception e)
            {
                throw new EvaluationException(e.getMessage(), expr.src, e);
            }
            
        }
        if(memoize && value != null)
        {
            env.put(key, value);
        }
        return value;
    }
    
    public Object evaluateLiteral(Literal literal) throws EvaluationException
    {
        switch(literal.kind)
        {
            case Literal.DOUBLE:
                return literal.dVal;
            case Literal.LONG:
                return literal.lVal;
            case Literal.STRING:
                return literal.sVal;
            default:
                throw new EvaluationException("Unknown literal type: " + literal.kind, literal.src);                
        }
    }
}
