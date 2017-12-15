/**
 * @(#) Knight.java
 */

package Chess;

public class Knight extends Figure
{
    public Knight( ) {}
    
    //konstruktorius. Iskvieciamas clone metode
    public Knight( Knight x )
    {
        super(x);
    }

    @Override
    public Knight clone( )
    {
        return new Knight(this);
    }

    @Override
    public void validMoves( )
    {
        System.out.println("---SHOW ALL VALID MOVES FOR THE KNIGHT---");
    }
    
    @Override
    public String getFigureSign( )
    {
        return "N";
    }

    @Override
    public void Accept(Visitor v) {
        v.visit(this);
    }
}
