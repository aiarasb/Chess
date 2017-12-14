/**
 * @(#) Promotion.java
 */

package Chess;

public class Promotion extends AbsMove
{
    private Cell from;
    
    private Cell to;
    
    private Pawn figure;
    
    private Figure promotedTo;
    
    public Promotion(Cell from, Cell to, Pawn pawn, Figure promotedTo)
    {
        this.from = from;
        this.to = to;
        this.figure = pawn;
        this.promotedTo = promotedTo;
    }
    
    public void undo( )
    {
        
    }
    
    @Override
    protected void removeFigure() {
        System.out.println("Promotion - remove figure");
    }

    @Override
    protected void moveFigure() {
        System.out.println("Promotion - remove figure");
    }

    @Override
    protected void promoteFigure() {
        System.out.println("Promotion - remove figure");
    }
    
}
