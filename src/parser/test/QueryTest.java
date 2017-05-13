/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.shelloid.query.CompilerException;
import com.shelloid.query.EvaluationCallback;
import com.shelloid.query.QueryCompiler;
import com.shelloid.query.QueryEvaluator;
import com.shelloid.query.vo.Literal;
import com.shelloid.query.vo.QualifiedName;
import com.shelloid.query.vo.ShelloidQuery;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jayaraj Poroor
 */
public class QueryTest
{

    public QueryTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void basicCompile() throws IOException, CompilerException
    {
        String queryStr = "SELECT phone.temp FROM node LET phonenum='324' "
                + "WHERE avg(phone.temp) > 60 "
                + " ACTION {log('${phone.temp}');} SAMPLE EVERY 3000";
        QueryCompiler compiler = new QueryCompiler();
        ByteArrayInputStream is = new ByteArrayInputStream(queryStr.getBytes());
        ShelloidQuery query = compiler.compile(is);
        assert (query.selectClause.selectTerms[0].name.components[1].equals("temp"));
    }

    @Test
    public void basicCompile2() throws IOException, CompilerException
    {
        String queryStr = "SELECT phone.temp FROM node LET phonenum='324' "
                + "WHERE avg(phone.temp) > 60 AND sum(phone.pressure) > 30  SETUP {something();}"
                + " ACTION {log('${phone.temp}');actuate(x.y*5 > 3, y.z+2);} SAMPLE EVERY 3000";
        QueryCompiler compiler = new QueryCompiler();
        ByteArrayInputStream is = new ByteArrayInputStream(queryStr.getBytes());
        ShelloidQuery query = null;
        try{
            query = compiler.compile(is);
            assert(query.setupClause != null);
        }catch(CompilerException e)
        {
            Iterator<String> it = e.getErrorMsgs().iterator();
            while(it.hasNext())
            {
                System.out.println("basicCompiled2: " + it.next());
            }
            throw e;            
        }
        assert (query.selectClause.selectTerms[0].name.components[1].equals("temp"));
    }
    
    @Test
    public void basicEval() throws Exception
    {
        final long tempVal = 30;
        final StringBuffer buf = new StringBuffer();
        String queryStr = "SELECT phone.temp FROM node LET phonenum='324'\n"
                + "WHERE avg(phone.temp) > 60\n"
                + "SETUP {xyz();}\n"
                + "TEARDOWN {}\n"
                + " ACTION {log('${phone.temp}');} SAMPLE ON temp_change";
        QueryCompiler compiler = new QueryCompiler();
        ByteArrayInputStream is = new ByteArrayInputStream(queryStr.getBytes());
        ShelloidQuery query = null;
        try{
            query = compiler.compile(is);
        }catch(CompilerException e)
        {
            Iterator<String> it = e.getErrorMsgs().iterator();
            while(it.hasNext())
            {
                System.out.println("basicEval: " + it.next());
            }
            throw e;
        }
        final QueryEvaluator eval = new QueryEvaluator();
        eval.init(query, new EvaluationCallback() {
            @Override
            public Object read(QualifiedName name)
            {
                if (name.components[1].equals("temp"))
                {
                    return tempVal;
                }
                else
                {
                    return -1;
                }
            }

            @Override
            public Object invoke(String name, Object[] params)
            {
                if (name.equals("avg"))
                {
                    return 100;
                }
                else if (eval.getState() == QueryEvaluator.ACTION_CLAUSE)
                {
                    if (name.equals("log") && params[0].equals("${phone.temp}"))
                    {
                        buf.append("log");
                    }
                }
                return null;
            }

        });
        eval.evaluateQuery();
        HashMap<String, Literal> resultMap = eval.getResult();
        assert (((Literal) resultMap.get("phone.temp")).lVal == tempVal);
        assert (buf.toString().equals("log"));
    }

    @Test
    public void syntaxError() throws Exception
    {
        final long tempVal = 30;
        final StringBuffer buf = new StringBuffer();
        String queryStr
                = "SELECT phone.temp FROM node LET phonenum='324 WHERE avg(phone.temp) > 60 "
                + "COLOCATE (phone.temp) ACTION log('${phone.temp}') SAMPLE EVERY 3000 ";
        QueryCompiler compiler = new QueryCompiler();
        ByteArrayInputStream is = new ByteArrayInputStream(queryStr.getBytes());
        try
        {
            ShelloidQuery query = compiler.compile(is);
        }
        catch (CompilerException e)
        {
            Iterator<String> it = e.getErrorMsgs().iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
            return;
        }
        assert (false);
    }

}
