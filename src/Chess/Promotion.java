/**
 * @(#) Promotion.java
 */

package Chess;

public class Promotion implements MoveInterface
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
    
    public void execute( )
    {
        
    }
    
    public void undo( )
    {
        
    }
    
    
}
