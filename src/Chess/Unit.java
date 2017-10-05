/**
 * @(#) Unit.java
 */

package Chess;

public class Unit
{
    private Position position;
    
    public Unit( int xPos, int yPos )
    {
        this.position = new Position(xPos, yPos);
    }  
    
    public Position getPosition( )
    {
        return position;
    }
    
    

    public void setPosition( Position position )
    {
        this.position=position;
    }
    
    
}
