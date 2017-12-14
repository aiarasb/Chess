/**
 * @(#) AIAdapter.java
 */

package Chess;

public class AIAdapter
{
    private AI artificialIntelligence;
    
    public AIAdapter( ) {
        artificialIntelligence = new AI();
    }
    
    public AbsMove getMove( ) {
        System.out.println("AI Adapter calls AI for move");
        //transform board
        String aiMove = artificialIntelligence.makeMove();
        
        Move move = new Move(null, null, null);
        //transform aiMove to Move
        
        return move;
    }
}
