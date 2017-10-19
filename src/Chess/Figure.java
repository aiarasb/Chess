/**
 * @(#) Figure.java
 */

package Chess;

public abstract class Figure
{
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
