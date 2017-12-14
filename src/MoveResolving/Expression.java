/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveResolving;

/**
 *
 * @author aiara
 * @param <ReturnType>
 */
public interface Expression<ReturnType> {
    abstract ReturnType interpret(String context);
}
