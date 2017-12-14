/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

/**
 *
 * @author Dovile
 */
public abstract class AbsMove {
    public void execute( ){
        removeFigure();
        moveFigure();
        promoteFigure();
    }
    
    public abstract void undo( );
    
    protected abstract void removeFigure( );
    
    protected abstract void moveFigure( );
    
    protected abstract void promoteFigure( );
    
}
