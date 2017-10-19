/**
 * @(#) Bishop.java
 */

package Chess;

public class Bishop extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    public Bishop (Bishop x)
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
        System.out.println("---SHOW ALL VALID MOVES FOR THE BISHOP---");
    }
}
