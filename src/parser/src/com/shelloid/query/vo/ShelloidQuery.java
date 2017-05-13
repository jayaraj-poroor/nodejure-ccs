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
public class ShelloidQuery implements Serializable{
    public SourceToken src;    
    public int priority;
    public SelectClause selectClause;
    public FromClause fromClause;
    public LetClause letClause;
    public WhereClause whereClause;
    public ShelloidScript setupClause;
    public ShelloidScript teardownClause;
    public ShelloidScript  actionClause;
    public SamplingClause samplingClause;    
    public ShelloidQuery()
    {
        priority = -1;
    }
    
    public ShelloidQuery(SelectClause select, FromClause from, LetClause let, 
            WhereClause where, ShelloidScript setup, ShelloidScript teardown, ShelloidScript action, 
            SamplingClause sampling, int priority)
    {
        this.priority = priority;
        selectClause = select;
        fromClause = from;
        letClause = let;
        whereClause = where;
        setupClause = setup;
        teardownClause = teardown;
        actionClause = action;
        samplingClause = sampling;
    }
}
