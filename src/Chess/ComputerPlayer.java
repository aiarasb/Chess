/**
 * @(#) ComputerPlayer.java
 */

package Chess;

public class ComputerPlayer extends Player
{
    private AIAdapter artificialIntelligence;
    
    public ComputerPlayer() {
        artificialIntelligence = new AIAdapter();
    }

    @Override
    public void getMove() {
        artificialIntelligence.getMove();
        System.out.println("---Computer makes move---");
    }

    
}
