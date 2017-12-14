/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

/**
 *
 * @author aiara
 * @param <ItemClass>
 */
public interface StackIterator<ItemClass> {
    abstract void push(ItemClass item);
    
    abstract ItemClass pop();
    
    abstract boolean empty();
    
    abstract ItemClass peek();
}
