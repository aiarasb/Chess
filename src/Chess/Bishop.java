/**
 * @(#) Bishop.java
 */

package Chess;

public class Bishop extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    private Bishop (Bishop x)
    {
        super(x);
    }

    @Override
    public Figure clone()
    {
        return new Bishop(this);
    }

    @Override
    public void validMoves()
    {
        
    }
}
