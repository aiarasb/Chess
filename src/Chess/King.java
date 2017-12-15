/**
 * @(#) King.java
 */

package Chess;

public class King extends Figure
{
    public King( ) {}
    
    //konstruktorius. Iskvieciamas clone metode
    public King( King x )
    {
        super(x);
    }

    @Override
    public King clone( )
    {
        return new King(this);
    }

    @Override
    public void validMoves( )
    {
        System.out.println("---SHOW ALL VALID MOVES FOR THE KING---");
    }
    
    @Override
    public String getFigureSign( )
    {
        return "K";
    }
    @Override
    public void Accept(Visitor v) {
        v.visit(this);
    }
}
