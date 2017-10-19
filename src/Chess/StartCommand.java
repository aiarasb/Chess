/**
 * @(#) StartCommand.java
 */

package Chess;

public class StartCommand extends Command
{
    private Game game;
    
    public StartCommand(Game game)
    {
        this.game = game;
    }

    @Override
    public void execute() {
        game.startGame();
    }
    
}
