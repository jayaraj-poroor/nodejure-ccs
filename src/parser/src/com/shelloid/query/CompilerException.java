/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shelloid.query;

/**
 *
 * @author Jayaraj Poroor
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Jayaraj Poroor
 */
public class CompilerException extends Exception{
    ArrayList<String> errorMsgs = null;
    public CompilerException(ArrayList<String> msgs)
    {
        super();
        errorMsgs = msgs;
    }
    
    public ArrayList<String> getErrorMsgs()
    {
        return errorMsgs;
    }
}
