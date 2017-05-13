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
public class BooleanExpr{
    public static final int UNDEFINED = -1;
    public static final int REL_EXPR = 0;
    public static final int OR = 1;    
    public static final int AND = 2;        
    public static final int NOT = 3;    
    
    public SourceToken src;
    public int    kind = UNDEFINED;
    public RelationalExpr relExpr;
    public BooleanExpr lExpr;
    public BooleanExpr rExpr;    
    
}
