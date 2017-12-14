/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveResolving;

/**
 *
 * @author aiara
 */
public class CaptureExpression implements Expression<Boolean> {
    
    @Override
    public Boolean interpret(String context)
    {
        return context.equals("x") || context.equals(":");
    }
}
