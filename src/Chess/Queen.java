/**
 * @(#) Queen.java
 */

package Chess;

public class Queen extends Figure
{
    public Queen () {}
    
    //konstruktorius. Iskvieciamas clone metode
    public Queen (Queen x)
    {
        super(x);
    }

    @Override
    public Queen clone()
    {
        return new Queen(this);
    }

    @Override
    public void validMoves()
    {
        System.out.println("---SHOW ALL VALID MOVES FOR THE QUEEN---");
    }
    
    @Override
    public String getFigureSign()
    {
        return "Q";
    }
}
