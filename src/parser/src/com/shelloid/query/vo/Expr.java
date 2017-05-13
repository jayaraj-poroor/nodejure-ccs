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
public class Expr implements Serializable{
    public ArithExpr arithExpr;
    public BooleanExpr booleanExpr;
    public Expr()
    {
        arithExpr = null;
        booleanExpr = null;
    }
}
