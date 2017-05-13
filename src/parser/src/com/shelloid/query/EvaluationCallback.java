/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shelloid.query;

import com.shelloid.query.vo.QualifiedName;

/**
 *
 * @author Jayaraj Poroor
 */
public interface EvaluationCallback {
    Object read(QualifiedName name) throws Exception;
    Object invoke(String name, Object[] params) throws Exception;
}
