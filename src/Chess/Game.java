/**
 * @(#) Game.java
 */

package Chess;

public class Game
{
    private Player whitePlayer;
    
    private Player blackPlayer;
        
    private HistoryStackIterator history;
    
    //Chain of Responsibility
    private Logger debugger = new DebuggerLogger();
    private Logger warning = new WarningLogger();
    private Logger error = new ErrorLogger();
	
    public Game( ){
        //surisama Chain of Responsibility eiga, eiliskumas
        debugger.setNextLogger(warning);
        warning.setNextLogger(error);
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
    
    public void testChainOfResponsibility()
    {
        debugger.log("123", "warning");
        debugger.log("abc", "error");
        debugger.log("asd", "debug");
        debugger.log("ktu", "ktu");
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
