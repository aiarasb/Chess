/**
 * @(#) Figure.java
 */

package Chess;

public abstract class Figure
{
    private String color;
    
    public Figure() {}

    //konstruktorius reikalingas prototipui
    public Figure(Figure f)
    {
        if (f != null)
        {
            this.color = f.color;
        }
    }

    public abstract void validMoves( );

    //abstraktus klonavimo metodas. Prototipo sablonui
    public abstract Figure clone();
    
    public abstract String getFigureSign();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
