/**
 * @(#) Knight.java
 */

package Chess;

public class Knight extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    private Knight (Knight x)
    {
        super(x);
    }

    @Override
    public Figure clone()
    {
        return new Knight(this);
    }

    @Override
    public void validMoves()
    {
        
    }
}