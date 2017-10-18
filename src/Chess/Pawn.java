/**
 * @(#) Pawn.java
 */

package Chess;

public class Pawn extends Figure
{
    private boolean promoted;
    
    private Figure promotedTo;

    private Pawn(Pawn p)
    {
        // Parent constructor call is mandatory in order to copy private fields
        // defined in parent class.
        super(p);

        if(p != null)
        {
            this.promoted = p.promoted;
            this.promotedTo = p.promotedTo;
        }
    }

    @Override
    public void validMoves()
    {
        
    }

    //clone metodo realizacija. Prototipo sablonui
    @Override
    public Figure clone()
    {
        return new Pawn(this);
    }
}
