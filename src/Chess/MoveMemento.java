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
public class MoveMemento {
    private AbsMove move;
    
    public MoveMemento(AbsMove move)
    {
        this.move = move;
    }
    
    public void setMove(AbsMove move)
    {
        this.move = move;
    }
    
    public AbsMove getMove()
    {
        return this.move;
    }
}
