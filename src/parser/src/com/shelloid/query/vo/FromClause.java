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
public class FromClause implements Serializable{
    public SourceToken src;    
    public String tableName;
}
