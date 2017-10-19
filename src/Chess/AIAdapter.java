/**
 * @(#) AIAdapter.java
 */

package Chess;

public class AIAdapter
{
    private AI artificialIntelligence;
    
    public AIAdapter() {
        artificialIntelligence = new AI();
    }
    
    public Move getMove() {
        System.out.println("AI Adapter calls AI for move");
        //transform board
        String aiMove = artificialIntelligence.makeMove();
        
        Move move = new Move();
        //transform aiMove to Move
        
        return move;
    }
}
