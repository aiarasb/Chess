/**
 * @(#) Move.java
 */

package Chess;

public class Move extends AbsMove
{
    private Cell from;
    
    private Cell to;
    
    private Figure figure;

    public Move(Cell from, Cell to, Figure figure) {
        this.from = from;
        this.to = to;
        this.figure = figure;
    }
    
    @Override
    public void undo( )
    {
        
    }

    @Override
    protected void removeFigure() {
        System.out.println("Move - remove figure");
    }

    @Override
    protected void moveFigure() {
        System.out.println("Move - move figure");
    }

    @Override
    protected void promoteFigure() {
        System.out.println("Move - promote figure");
    }
    
    
}
