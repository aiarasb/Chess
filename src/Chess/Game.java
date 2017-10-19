/**
 * @(#) Game.java
 */

package Chess;

public class Game
{
    private Player whitePlayer;
    
    private Player blackPlayer;
    
    private MoveHistory moveHistory;
	
	public Game(){
        moveHistory = new MoveHistory();
    }
    
    public void startGame( )
    {
        StartCommand command = new StartCommand();
        command.execute();
    }
    
	public void undoMove(){
        moveHistory.undoMove();
    } 
    
}
