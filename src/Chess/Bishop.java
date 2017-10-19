/**
 * @(#) Bishop.java
 */

package Chess;

public class Bishop extends Figure
{
    public Bishop () {}
    
    //konstruktorius. Iskvieciamas clone metode
    public Bishop (Bishop x)
    {
        super(x);
    }

    @Override
    public Bishop clone()
    {
        return new Bishop(this);
    }

    @Override
    public void validMoves()
    {
        System.out.println("---SHOW ALL VALID MOVES FOR THE BISHOP---");
    }
    
    @Override
    public String getFigureSign()
    {
        return "B";
    }
}
