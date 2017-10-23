/**
 * @(#) HumanPlayer.java
 */

package Chess;

import java.util.Scanner;

public class HumanPlayer extends Player
{

    @Override
    public MoveInterface getMove( ) {
        System.out.print("Next move:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("--- Your move: " + input + "---");
        
        MoveInterface move = new Move(null, null, null);
        
        return move;
    }
    
}
