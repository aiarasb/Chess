/**
 * @(#) AbstractFactory.java
 */

package Chess;

public abstract class AbstractFactory
{
    public abstract Figure getFigure( String type );
    
    public abstract Cell getCell( String color );
    
    
}
