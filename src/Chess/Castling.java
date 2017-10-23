/**
 * @(#) Castling.java
 */

package Chess;

public class Castling implements MoveInterface
{
    private Cell from;
    
    private Cell to;
    
    private King figure;
    
    private Rook rook;
    
    private Cell rookFrom;
    
    private Cell rookTo;

    public Castling(Cell from, Cell to, King figure, Rook rook, Cell rookFrom, Cell rookTo) {
        this.from = from;
        this.to = to;
        this.figure = figure;
        this.rook = rook;
        this.rookFrom = rookFrom;
        this.rookTo = rookTo;
    }
    
    public void execute( )
    {
        
    }
    
    public void undo( )
    {
        
    }
    
    
}
