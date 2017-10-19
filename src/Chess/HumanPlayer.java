/**
 * @(#) HumanPlayer.java
 */

package Chess;

public class HumanPlayer extends Player
{

    @Override
    public void getMove() {
        System.out.print("Sekantis ejimas:");
        String input = System.console().readLine();
        System.out.println("---Ejimas gautas. Norejote eiti: " + input + "---");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
