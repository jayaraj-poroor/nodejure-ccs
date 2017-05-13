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
public class SelectTerm implements Serializable{
    public static final int UNKNOWN = -1;
    public static final int ATTRIBUTE = 0;
    public static final int FUNCTION_CALL = 1;
    
    public SourceToken src;    
    public int kind = UNKNOWN;
    public QualifiedName name;
    public QualifiedName [] params;
}
