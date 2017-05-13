/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shelloid.query.vo;

import java.io.Serializable;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Jayaraj Poroor
 */
public class SourceToken implements Serializable {
    public int line;
    public int charPos;
    public String text;
    
    public SourceToken(Token token)
    {
        line = token.getLine();
        charPos = token.getCharPositionInLine();
        text = token.getText();
    }

    public String toString()
    {
        return "Line : " + line + ", char: " + charPos + " near " + text;
    }
}
