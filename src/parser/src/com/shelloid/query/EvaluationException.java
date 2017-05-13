/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shelloid.query;

import com.shelloid.query.vo.SourceToken;

/**
 *
 * @author Jayaraj Poroor
 */
public class EvaluationException extends Exception{
    SourceToken src;
    public EvaluationException(String msg, SourceToken src)
    {
        super(msg);
        this.src = src;
    }

    public EvaluationException(String msg, SourceToken src, Throwable cause)
    {
        super(msg, cause);
        this.src = src;
    }
    
    public SourceToken getSource()
    {
        return src;
    }
}
