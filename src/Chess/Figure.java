/**
 * @(#) Figure.java
 */

package Chess;

public class Figure extends Unit
{
    private String colour;
    
    public Figure( int[] position, String colour )
    {
        super(position);
        this.colour = colour;
    }
    
    public void makeMove( )
    {
        
    }
    
    public void setColour( String colour )
    {
        this.colour=colour;
    }
    
    public String getColour( )
    {
        return colour;
    }
    
    
}
