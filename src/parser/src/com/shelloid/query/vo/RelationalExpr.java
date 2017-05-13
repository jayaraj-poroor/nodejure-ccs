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
public class RelationalExpr extends Expr{
    public static final int UNDEFINED = -1;
    public static final int GT = 0;
    public static final int LT = 1;    
    public static final int GTE = 2;        
    public static final int LTE = 3;    
    public static final int EQ = 4;        
    public static final int NEQ = 5;        
    
    public SourceToken src;    
    public int    kind = UNDEFINED;
    public ArithExpr lExpr;
    public ArithExpr rExpr;    
}
