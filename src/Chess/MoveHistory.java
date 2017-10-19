/**
 * @(#) MoveHistory.java
 */

package Chess;

public class MoveHistory
{
    private Move[] moves;
    
    public void undoMove( )
    {
		UndoCommand undo = new UndoCommand();
        undo.execute();

    }
    
    
}
