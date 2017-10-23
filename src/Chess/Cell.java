/**
 * @(#) Cell.java
 */

package Chess;

public abstract class Cell
{
    private Position position;
    
    private Figure figure;
    
    public abstract String getColor( );

    public Position getPosition( ) {
        return position;
    }

    public void setPosition( Position position ) {
        this.position = position;
    }

    public Figure getFigure( ) {
        return figure;
    }

    public void setFigure( Figure figure ) {
        this.figure = figure;
    }
    
    
}
