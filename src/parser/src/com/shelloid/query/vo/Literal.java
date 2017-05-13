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
public class Literal implements Serializable{
    public static final int UNDEFINED = -1;
    public static final int LONG = 1;
    public static final int DOUBLE = 2;
    public static final int STRING = 3;
    public static final int BOOLEAN = 4;    
    
    public SourceToken src;    
    public int kind = UNDEFINED;
    public String sVal;
    public long   lVal;
    public double dVal;    
    public boolean bVal;
}
