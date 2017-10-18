/**
 * @(#) Queen.java
 */

package Chess;

public class Queen extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    private Queen (Queen x)
    {
        super(x);
    }

    @Override
    public Figure clone()
    {
        return new Queen(this);
    }

    @Override
    public void validMoves()
    {
        
    }
}