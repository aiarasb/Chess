/**
 * @(#) Game.java
 */

package Chess;

public class Game
{
    private Player whitePlayer;
    
    private Player blackPlayer;
        
    private HistoryStackIterator history;
	
    public Game( ){
    }
    
    public void startGame( )
    {
        if(whitePlayer == null)
        {
            this.whitePlayer = new ComputerPlayer();
        }
        if(blackPlayer == null)
        {
            this.blackPlayer = new ComputerPlayer();
        }
        
        history = new HistoryStackIterator(new GameHistory());
        
        boolean placeholder = false;
        AbsMove move;
        MoveMemento moveMemento;
        while(isGameOver() == placeholder) {
            move = whitePlayer.getMove();
            moveMemento = new MoveMemento(move);
            history.push(moveMemento);
            move = blackPlayer.getMove();
            moveMemento = new MoveMemento(move);
            history.push(moveMemento);
            placeholder = !placeholder;
        }
    }
    
    public void undoMove( ){
        MoveMemento lastMoveMemento = history.pop();
        AbsMove lastMove = lastMoveMemento.getMove();
        lastMove.undo();
    }

    public void setWhitePlayer( Player p )
    {
        this.whitePlayer = p;
    }

    public void setBlackPlayer( Player p )
    {
        this.blackPlayer = p;
    }
    
    private boolean isGameOver( ) 
    {
        return false;
    }
}
