/**
 * @(#) Rook.java
 */

package Chess;

public class Rook extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    public Rook (Rook x)
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
        System.out.println("---SHOW ALL VALID MOVES FOR THE ROOK---");
    }
}
