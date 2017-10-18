/**
 * @(#) Rook.java
 */

package Chess;

public class Rook extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    private Rook (Rook x)
    {
        super(x);
    }

    @Override
    public Figure clone()
    {
        return new Rook(this);
    }

    @Override
    public void validMoves()
    {
        
    }
}
