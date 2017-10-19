/**
 * @(#) UndoCommand.java
 */

package Chess;

public class UndoCommand extends Command
{
    private Game game;
    
    public UndoCommand(Game game)
    {
        this.game = game;
    }

    @Override
    public void execute() {
        game.undoMove();
    }
    
}
