/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelloid.query;

import com.shelloid.query.ShelloidQueryParser.ActionClauseContext;
import com.shelloid.query.ShelloidQueryParser.ArithExprContext;
import com.shelloid.query.ShelloidQueryParser.BooleanExprContext;
import com.shelloid.query.ShelloidQueryParser.CommonExprContext;
import com.shelloid.query.ShelloidQueryParser.FromClauseContext;
import com.shelloid.query.ShelloidQueryParser.FunctionCallExprContext;
import com.shelloid.query.ShelloidQueryParser.LetClauseContext;
import com.shelloid.query.ShelloidQueryParser.LiteralContext;
import com.shelloid.query.ShelloidQueryParser.ParamListContext;
import com.shelloid.query.ShelloidQueryParser.QualifiedNameContext;
import com.shelloid.query.ShelloidQueryParser.QueryContext;
import com.shelloid.query.ShelloidQueryParser.RelationalExprContext;
import com.shelloid.query.ShelloidQueryParser.SamplingClauseContext;
import com.shelloid.query.ShelloidQueryParser.ScriptContext;
import com.shelloid.query.ShelloidQueryParser.SelectClauseContext;
import com.shelloid.query.ShelloidQueryParser.SelectTermContext;
import com.shelloid.query.ShelloidQueryParser.SetupClauseContext;
import com.shelloid.query.ShelloidQueryParser.SimpleNameContext;
import com.shelloid.query.ShelloidQueryParser.TeardownClauseContext;
import com.shelloid.query.ShelloidQueryParser.WhereClauseContext;
import com.shelloid.query.vo.ArithExpr;
import com.shelloid.query.vo.BooleanExpr;
import com.shelloid.query.vo.Expr;
import com.shelloid.query.vo.FromClause;
import com.shelloid.query.vo.LetClause;
import com.shelloid.query.vo.Literal;
import com.shelloid.query.vo.QualifiedName;
import com.shelloid.query.vo.RelationalExpr;
import com.shelloid.query.vo.SamplingClause;
import com.shelloid.query.vo.SelectClause;
import com.shelloid.query.vo.SelectTerm;
import com.shelloid.query.vo.ShelloidQuery;
import com.shelloid.query.vo.ShelloidScript;
import com.shelloid.query.vo.SourceToken;
import com.shelloid.query.vo.WhereClause;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Jayaraj Poroor
 */
public class QueryCompiler {
    ArrayList<String> errorMsgs = new ArrayList();
    
    public QueryCompiler()
    {
        
    }
    
    public ShelloidQuery compile(InputStream is)
                                            throws IOException, CompilerException
    {
        errorMsgs.clear();
        ShelloidQueryLexer lexer = new ShelloidQueryLexer(new ANTLRInputStream(is));
        ShelloidQueryParser parser = new ShelloidQueryParser(new CommonTokenStream(lexer));
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        CustomErrorListener errorListener = new CustomErrorListener();
        lexer.addErrorListener(errorListener);
        parser.addErrorListener(errorListener);
        QueryContext queryCtx = parser.query();
        ShelloidQuery query = translateQuery(queryCtx);
        if(errorMsgs.size() > 0)
        {
            throw new CompilerException(errorMsgs);
        }
        return query;
    }
    
    ShelloidQuery translateQuery(QueryContext queryCtx)
    {
        ShelloidQuery query = new ShelloidQuery();
        query.src = new SourceToken(queryCtx.start);
        SelectClauseContext     selectCtx   = queryCtx.selectClause();
        FromClauseContext       fromCtx     = queryCtx.fromClause();
        LetClauseContext        letCtx      = queryCtx.letClause();
        WhereClauseContext      whereCtx    = queryCtx.whereClause();  
        SetupClauseContext      setupCtx    = queryCtx.setupClause();
        TeardownClauseContext   teardownCtx = queryCtx.teardownClause();
        ActionClauseContext     actionCtx   = queryCtx.actionClause();         
        SamplingClauseContext   samplingCtx = queryCtx.samplingClause();
        String priorityStr = null;
        if(queryCtx.priority() != null){
            priorityStr =    queryCtx.priority().INT().getText();
        }
        
        if(selectCtx != null)
        {
            query.selectClause  = translateSelect(selectCtx);
        }
        if(fromCtx != null)
        {
            query.fromClause    = translateFrom(fromCtx);
        }
        if(letCtx != null)
        {
            query.letClause     = translateLet(letCtx);
        }
        if(whereCtx != null)
        {
            query.whereClause = translateWhere(whereCtx);
        }
        
        if(setupCtx != null && setupCtx.actionClause() != null)
        {
            query.setupClause = translateAction(setupCtx.actionClause());
        }

        if(teardownCtx != null && teardownCtx.actionClause() != null)
        {
            query.teardownClause = translateAction(teardownCtx.actionClause());
        }
        
        if(actionCtx != null)
        {
            query.actionClause = translateAction(actionCtx);
        }
        
        if(samplingCtx != null){
            query.samplingClause = translateSampling(samplingCtx);
        }
        
        try
        {
            if(priorityStr != null){
                query.priority = Integer.parseInt(priorityStr);
            }
        }catch(NumberFormatException e)
        {
            compileError(queryCtx.priority().INT().getSymbol(), 
                          "Invalid PRIORITY: " + priorityStr);
        }
        
        return query;
    }
    
    SamplingClause translateSampling(SamplingClauseContext samplingCtx)
    {
        SamplingClause sampling = new SamplingClause();
        try
        {
            if(samplingCtx.samplingPeriod() != null){
                String samplingPeriodStr = samplingCtx.samplingPeriod().INT().getText();
                sampling.samplingPeriod = Integer.parseInt(samplingPeriodStr);
            }
        }catch(NumberFormatException e)
        {
            compileError(samplingCtx.samplingPeriod().INT().getSymbol(), 
                          "Invalid SAMPLING PERIOD: " + samplingCtx.samplingPeriod().getText());
        }
        
        if(samplingCtx.samplingEvents() != null)
        {
            sampling.samplingEvents = new String[samplingCtx.samplingEvents().ID().size()];
            Iterator<TerminalNode> it = samplingCtx.samplingEvents().ID().iterator();
            int i = 0;
            while(it.hasNext()){
                sampling.samplingEvents[i] = it.next().getText();
                i++;
            }
        }
        
        return sampling;        
    }
    
    SelectClause translateSelect(SelectClauseContext selectCtx)
    {
        SelectClause selectClause = new SelectClause();
        selectClause.src = new SourceToken(selectCtx.start);        
        ArrayList<SelectTerm> termList = new ArrayList<>();
        Iterator<SelectTermContext> it = selectCtx.selectTerm().iterator();
        while(it.hasNext())
        {
            SelectTermContext termCtx = it.next();
            SelectTerm term = translateSelectTerm(termCtx);
            termList.add(term);
        }
        selectClause.selectTerms = termList.toArray(new SelectTerm[termList.size()]);
        return selectClause;
    }
    
    FromClause translateFrom(FromClauseContext fromCtx)
    {
        FromClause fromClause = new FromClause();
        fromClause.src = new SourceToken(fromCtx.start);                
        fromClause.tableName = fromCtx.simpleName().ID().getText();
        return fromClause;
    }
    
    LetClause translateLet(LetClauseContext letCtx)
    {
        LetClause letClause = new LetClause();
        letClause.src = new SourceToken(letCtx.start);                
        Iterator<SimpleNameContext> itName = letCtx.simpleName().iterator();
        Iterator<LiteralContext> itExpr = letCtx.literal().iterator();
        while(itName.hasNext() && itExpr.hasNext())
        {
            SimpleNameContext nameCtx = itName.next();
            LiteralContext literalCtx = itExpr.next();
            letClause.map.put(nameCtx.ID().getText(), translateLiteral(literalCtx));
        }
        return letClause;
    }
    
    WhereClause translateWhere(WhereClauseContext whereCtx)
    {
        WhereClause whereClause = new WhereClause();
        whereClause.src = new SourceToken(whereCtx.start);                
        whereClause.expr = translateBooleanExpr(whereCtx.booleanExpr());
        return whereClause;
    }
    
   
    ShelloidScript translateAction(ActionClauseContext actionCtx)
    {
        if(actionCtx.script() != null){
            return translateScript(actionCtx.script());
        }else
        {
            compileError(actionCtx.start, "Script not found for action clause");
            return null;
        }
            
    }
    
    ShelloidScript translateScript(ScriptContext scriptCtx)
    {
        ShelloidScript script = new ShelloidScript();
        script.src = new SourceToken(scriptCtx.start);                
        script.actions = new ArithExpr[scriptCtx.functionCallExpr().size()];
        Iterator<FunctionCallExprContext> it = scriptCtx.functionCallExpr().iterator();
        int i = 0;
        while(it.hasNext())
        {
            script.actions[i] = translateFunctionCall(it.next());
            i++;
        }
        return script;
    }
    
    Literal translateLiteral(LiteralContext literalCtx)
    {
        Literal literal = new Literal();
        literal.src = new SourceToken(literalCtx.start);                        
        try {
            if (literalCtx.INT() != null) {
                literal.kind = Literal.LONG;
                literal.lVal = Long.parseLong(literalCtx.INT().getText());
            } else if (literalCtx.FLOAT() != null) {
                literal.kind = Literal.DOUBLE;
                literal.dVal = Double.parseDouble(literalCtx.FLOAT().getText());
            } else if (literalCtx.STRING() != null) {
                literal.kind = Literal.STRING;
                String s = literalCtx.STRING().getText();
                literal.sVal = s.substring(1, s.length() - 1);
            }
        } catch (NumberFormatException e) {
            compileError(literalCtx.start,
                    "Invalid Number Format: " + literalCtx.getText());
        }
        return literal;
    }
    
    ArithExpr translateFunctionCall(FunctionCallExprContext funCtx)
    {
        ArithExpr expr = new ArithExpr();
        expr.src = new SourceToken(funCtx.start);                        
        expr.kind = ArithExpr.FUNCTION_CALL;
        expr.name = new QualifiedName();
        expr.name.components = new String[1];
        if(funCtx.simpleName() != null){
            expr.name.components[0] = funCtx.simpleName().ID().getText();
        }
        else{
            expr.name.components[0] = "<unknown>";
            this.compileError(funCtx.simpleName().start, "Function name not specified properly.");
        }
        expr.subExprs = new Expr[funCtx.commonExpr().size()];
        Iterator<CommonExprContext> it = funCtx.commonExpr().iterator();
        int i = 0;
        while (it.hasNext()) {
            CommonExprContext paramExpr = it.next();
            Expr subExpr = new Expr();
            expr.subExprs[i] = subExpr;
            if(paramExpr.arithExpr() != null)
            {
                subExpr.arithExpr = translateArithExpr(paramExpr.arithExpr());
            }else
            if(paramExpr.booleanExpr()!= null)
            {
                subExpr.booleanExpr = translateBooleanExpr(paramExpr.booleanExpr());
            }else
            {
                this.compileError(paramExpr.start, "Invalid Parameter Expression.");
            }
            i++;
        }
        return expr;
    }
    
    ArithExpr translateArithExpr(ArithExprContext exprCtx) 
    {
        QualifiedNameContext qnameCtx = exprCtx.qualifiedName();
        LiteralContext  literalCtx = exprCtx.literal();
        FunctionCallExprContext funCtx = exprCtx.functionCallExpr();
        if(qnameCtx != null)
        {
            ArithExpr expr = new ArithExpr();            
            expr.src = new SourceToken(exprCtx.start);                                    
            expr.kind = ArithExpr.NAME;
            expr.name = translateQualifiedName(qnameCtx);
            return expr;
        }else
        if(literalCtx != null)
        {
            ArithExpr expr = new ArithExpr();            
            expr.src = new SourceToken(exprCtx.start);
            expr.kind = ArithExpr.LITERAL;            
            expr.literal = translateLiteral(literalCtx);
            return expr;
        }else
        if(funCtx != null)
        {
            return translateFunctionCall(funCtx);
        }else
        {
            if(exprCtx.op !=null )
            {   
                ArithExpr expr = new ArithExpr();                            
                expr.src = new SourceToken(exprCtx.start);
                if(exprCtx.arithExpr().size() > 1)
                {
                    switch (exprCtx.op.getText()) {
                        case "+":
                            expr.kind = ArithExpr.ADD;
                            break;
                        case "-":
                            expr.kind = ArithExpr.SUB;
                            break;
                        case "*":
                            expr.kind = ArithExpr.MUL;
                            break;
                        case "/":
                            expr.kind = ArithExpr.DIV;
                            break;
                        case "%":
                            expr.kind = ArithExpr.MOD;
                            break;
                        default:
                            compileError(exprCtx.op,
                                    "Invalid Binary Arithmetic Operator: " + exprCtx.op.getText());
                            break;
                    }
                    
                    expr.subExprs = new Expr[2];
                    expr.subExprs[0] = new Expr();
                    expr.subExprs[1] = new Expr();
                    expr.subExprs[0].arithExpr = translateArithExpr(exprCtx.arithExpr(0));
                    expr.subExprs[1].arithExpr = translateArithExpr(exprCtx.arithExpr(1));
                }else
                {
                    if(exprCtx.op.getText().equals("-"))
                    {    
                        expr.kind = ArithExpr.UNARY_MINUS;
                    }
                    else
                    {
                        compileError(exprCtx.op,
                                  "Invalid Unary Arithmetic Operator: " + exprCtx.op.getText());                        
                    }
                    expr.subExprs = new Expr[1];
                    expr.subExprs[0] = new Expr();
                    expr.subExprs[0].arithExpr = translateArithExpr(exprCtx.arithExpr(0));                    
                }
                return expr;
            }else
            {
                return translateArithExpr(exprCtx.arithExpr(0));
            }
        }
    }
    
    RelationalExpr translateRelationalExpr(RelationalExprContext exprCtx)
    {
        if(exprCtx.op != null)
        {
            RelationalExpr expr = new RelationalExpr();
            expr.src = new SourceToken(exprCtx.start);
            switch(exprCtx.op.getText())
            {
                case ">" : expr.kind = RelationalExpr.GT; break;
                case ">=": expr.kind = RelationalExpr.GTE; break;
                case "<" : expr.kind = RelationalExpr.LT; break;
                case "<=": expr.kind = RelationalExpr.LTE; break;
                case "=" : expr.kind = RelationalExpr.EQ; break;
                case "<>": expr.kind = RelationalExpr.NEQ; break;
                default:
                        compileError(exprCtx.op,
                                  "Invalid Relational Operator: " + exprCtx.op.getText());                        
                        break;
                    
            }
            expr.lExpr = translateArithExpr(exprCtx.arithExpr(0));
            expr.rExpr = translateArithExpr(exprCtx.arithExpr(1));
            return expr;
        }else
        {
            assert(exprCtx.relationalExpr()!= null);
            return translateRelationalExpr(exprCtx.relationalExpr());
        }
    }

    BooleanExpr translateBooleanExpr(BooleanExprContext exprCtx)
    {
        if(exprCtx.relationalExpr()!= null)
        {
            BooleanExpr expr = new BooleanExpr();
            expr.src = new SourceToken(exprCtx.start);            
            expr.kind = BooleanExpr.REL_EXPR;
            expr.relExpr = translateRelationalExpr(exprCtx.relationalExpr());
            return expr;
        }else
        if(exprCtx.op != null)
        {
            BooleanExpr expr = new BooleanExpr();
            expr.src = new SourceToken(exprCtx.start);            
            switch(exprCtx.op.getText())
            {
                case "OR" : expr.kind = BooleanExpr.OR; break;
                case "AND": expr.kind = BooleanExpr.AND; break;
                case "NOT" : expr.kind = BooleanExpr.NOT; break;
                default:
                        compileError(exprCtx.op,
                                  "Invalid Boolean Operator: " + exprCtx.op.getText());                        
                        break;
                    
            }
            expr.lExpr = translateBooleanExpr(exprCtx.booleanExpr(0));
            if(exprCtx.booleanExpr().size() > 1)
            {
                expr.rExpr = translateBooleanExpr(exprCtx.booleanExpr(1));
            }
            return expr;
        }else
        {
            assert(exprCtx.booleanExpr(0)!= null);
            return translateBooleanExpr(exprCtx.booleanExpr(0));
        }
    }
    
    SelectTerm translateSelectTerm(SelectTermContext termCtx)
    {
        SelectTerm term = new SelectTerm();
        term.src = new SourceToken(termCtx.start);
        QualifiedNameContext qualNameCtx = termCtx.qualifiedName();
        SimpleNameContext simpleNameCtx = termCtx.simpleName();
        ParamListContext paramListCtx = termCtx.paramList();
        if(qualNameCtx != null)
        {
            term.kind = SelectTerm.ATTRIBUTE;
            term.name = translateQualifiedName(qualNameCtx);
        }else
        if(simpleNameCtx != null && paramListCtx != null)
        {
            term.kind = SelectTerm.FUNCTION_CALL;
            term.name = new QualifiedName();
            term.name.components = new String[1];
            term.name.components[0] = simpleNameCtx.ID().getText();
            term.params = new QualifiedName[paramListCtx.qualifiedName().size()];
            Iterator<QualifiedNameContext> it = paramListCtx.qualifiedName().iterator();
            ArrayList<QualifiedName> paramList = new ArrayList<>();
            while(it.hasNext())
            {
                QualifiedNameContext qnameCtx = it.next();
                paramList.add(translateQualifiedName(qnameCtx));
            }
            
            term.params = paramList.toArray(term.params);
        }else
        {
            compileError(termCtx.start, 
                          "Invalid SELECT term: " + termCtx.getText());
            
        }
        return term;
    }
    
    QualifiedName translateQualifiedName(QualifiedNameContext qualNameCtx)
    {
        QualifiedName name = new QualifiedName();
        name.src = new SourceToken(qualNameCtx.start);        
        name.components = new String[qualNameCtx.ID().size()];
        Iterator<TerminalNode> it = qualNameCtx.ID().iterator();
        int i = 0;
        while (it.hasNext()) {
            name.components[i] = it.next().getText();
            i++;
        }
        if(name.components.length < 2)
        {
            compileError(qualNameCtx.start,
                    "Invalid qualified name (need at least 2 components): " + qualNameCtx.getText());
        }
        return name;
    }
    
   void compileError(Token token, String msg)
    {
        String errorMsg
                = "Syntax Error at: " + token.getLine() + ": " + token.getCharPositionInLine()
                + " near " + token.getText() + ", cause: " + msg;
        errorMsgs.add(errorMsg);
    }
    
    class CustomErrorListener extends BaseErrorListener
    {
        public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, 
                                int line, int charPositionInLine, String msg, 
                                RecognitionException e)
        {
            String nearTxt = (offendingSymbol instanceof Token) ? 
                               " near " + ((Token) offendingSymbol).getText() : "";
            String errorPrefix = (offendingSymbol == null) ? "Lexer Error at: " : "Parse Error at: ";
            String errorMsg = 
                           errorPrefix + line + ":" + charPositionInLine+
                            nearTxt + " msg: " + msg;
            errorMsgs.add(errorMsg);
        }
    }
    
}
