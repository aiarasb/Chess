/**
 * @(#) EnPessant.java
 */

package Chess;

public class EnPessant implements MoveInterface
{
    private Cell from;
    
    private Cell to;
    
    private Pawn figure;
    
    public EnPessant(Cell from, Cell to, Pawn pawn)
    {
        this.from = from;
        this.to = to;
        this.figure = pawn;
    }
    
    public void execute( )
    {
        
    }
    
    public void undo( )
    {
        
    }
    
    
}
