/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

/**
 *
 * @author aiara
 */
public class HistoryStackIterator implements StackIterator<MoveMemento> {
    
    private GameHistory history;
    private int index = -1;
    
    public HistoryStackIterator(GameHistory history)
    {
        this.history = history;
    }
    
    @Override
    public void push(MoveMemento item)
    {
        index++;
        history.setHistory(item, index);
    }
    
    @Override
    public MoveMemento pop()
    {
        return history.getHistory(index--);
    }
    
    @Override
    public boolean empty()
    {
        return index < 0;
    }
    
    @Override
    public MoveMemento peek()
    {
        return history.getHistory(index);
    }
}
