/**
 * @(#) ComputerPlayer.java
 */

package Chess;

public class ComputerPlayer extends Player
{
    private AIAdapter artificialIntelligence;
    
    public ComputerPlayer( ) {
        artificialIntelligence = new AIAdapter();
    }

    @Override
    public AbsMove getMove( ) {
        AbsMove move = artificialIntelligence.getMove();
        System.out.println("---Computer makes move---");
        
        return move;
    }

    
}
