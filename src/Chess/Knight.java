/**
 * @(#) Knight.java
 */

package Chess;

public class Knight extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    public Knight (Knight x)
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
        System.out.println("---SHOW ALL VALID MOVES FOR THE KNIGHT---");
    }
}
