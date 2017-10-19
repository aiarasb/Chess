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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
