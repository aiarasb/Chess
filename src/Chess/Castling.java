/**
 * @(#) Castling.java
 */

package Chess;

public class Castling extends AbsMove
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
    
    @Override
    public void undo( )
    {
        
    }

    @Override
    protected void removeFigure() {
       System.out.println("Casting - remove figure");
    }

    @Override
    protected void moveFigure() {
        System.out.println("Casting - move figure");
    }

    @Override
    protected void promoteFigure() {
        System.out.println("Casting - promote figure");
    }
  
}
