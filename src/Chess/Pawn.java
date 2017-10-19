/**
 * @(#) Pawn.java
 */

package Chess;

public class Pawn extends Figure
{
    private boolean promoted;
    
    private Figure promotedTo;

    public Pawn(Pawn p)
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

    public Pawn()
    {
        this.promoted = false;
        this.promoted = "";
    }

    @Override
    public void validMoves()
    {
        System.out.println("---SHOW ALL VALID MOVES FOR THE PAWN---");
    }

    //clone metodo realizacija. Prototipo sablonui
    @Override
    public Pawn clone()
    {
        return new Pawn(this);
    }
}
