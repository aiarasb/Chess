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
        if(whitePlayer == null)
        {
            this.whitePlayer = new HumanPlayer();
        }
        if(blackPlayer == null)
        {
            this.blackPlayer = new HumanPlayer();
        }
        StartCommand command = new StartCommand();
        command.execute();
    }
    
	public void undoMove(){
        moveHistory.undoMove();
    }

    public void setWhitePlayer(Player p)
    {
        this.whitePlayer = p;
    }

    public void setBlackPlayer(Player p)
    {
        this.blackPlayer = p;
    }
}
