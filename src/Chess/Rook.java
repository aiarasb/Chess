/**
 * @(#) Rook.java
 */

package Chess;

public class Rook extends Figure
{
    public Rook( ) {}
    
    //konstruktorius. Iskvieciamas clone metode
    public Rook( Rook x )
    {
        super(x);
    }

    @Override
    public Rook clone( )
    {
        return new Rook(this);
    }

    @Override
    public void validMoves( )
    {
        System.out.println("---SHOW ALL VALID MOVES FOR THE ROOK---");
    }
    
    @Override
    public String getFigureSign( )
    {
        return "R";
    }
    @Override
    public void Accept(Visitor v) {
        v.visit(this);
    }
}
