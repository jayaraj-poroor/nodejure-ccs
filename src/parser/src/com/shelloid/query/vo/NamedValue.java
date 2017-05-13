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
public class NamedValue implements Serializable{
    public Object value;
    public QualifiedName name;
    
    public NamedValue(QualifiedName name, Object value)
    {
        this.name = name;
        this.value = value;
    }
    
    public NamedValue()
    {
        
    }
    
    public String toString()
    {
        return this.name.toString();
    }
}
