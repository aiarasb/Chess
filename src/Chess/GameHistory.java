/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

import java.util.*;

/**
 *
 * @author aiara
 */
public class GameHistory {
    private ArrayList<MoveMemento> history = new ArrayList<>();
    
    public void setHistory(MoveMemento item, int index)
    {
        history.set(index, item);
    }
    
    public MoveMemento getHistory(int index)
    {
        return history.get(index);
    }
}
