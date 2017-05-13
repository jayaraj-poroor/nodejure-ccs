/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shelloid.query.vo;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Jayaraj Poroor
 */
public class LetClause implements Serializable{
    public SourceToken src;    
    public HashMap<String, Literal> map;
    
    public LetClause()
    {
        map = new HashMap<String, Literal>();
    }
}
