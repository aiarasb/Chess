/**
 * @(#) UndoCommand.java
 */

package Chess;

public class UndoCommand extends Command
{

    @Override
    public void execute() {
        System.out.println("***UNDO ONE MOVE!***");
    }
    
}
