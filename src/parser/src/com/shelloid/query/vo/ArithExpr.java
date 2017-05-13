/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shelloid.query.vo;

import java.io.Serializable;

/**
 *
 * @author Jayaraj Poroor
 */
public class ArithExpr{
    public static final int UNDEFINED = -1;
    public static final int NAME = 0;
    public static final int LITERAL = 1;
    public static final int FUNCTION_CALL = 2;
    public static final int ADD  = 3;    
    public static final int SUB = 4;    
    public static final int MUL = 5;
    public static final int DIV = 6;
    public static final int MOD = 7;    
    public static final int UNARY_MINUS = 8;    
    
    public SourceToken src;    
    public int    kind = UNDEFINED;
    public Literal literal;
    public QualifiedName name;
    public Expr[] subExprs;
}
