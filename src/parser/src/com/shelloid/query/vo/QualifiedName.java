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
public class QualifiedName implements Serializable{
    public SourceToken src;    
    public String [] components;
    
    public String toString()
    {
        if(components.length == 1) //optimization
            return components[0];
        
        StringBuilder buf = new StringBuilder();
        for(int i=0;i<components.length;i++)
        {
            if(i > 0)
            {
                buf.append(".");
            }
            buf.append(components[i]);
        }
        return buf.toString();
    }
}
