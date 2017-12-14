/**
 * @(#) EnPessant.java
 */

package Chess;

public class EnPessant extends AbsMove
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
    
    @Override
    public void undo( )
    {
        
    }

    @Override
    protected void removeFigure() {
        System.out.println("EnPessant - remove figure");
    }

    @Override
    protected void moveFigure() {
        System.out.println("EnPessant - remove figure");
    }

    @Override
    protected void promoteFigure() {
        System.out.println("EnPessant - remove figure");
    }
    
    
}
