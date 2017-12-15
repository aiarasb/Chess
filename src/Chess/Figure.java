/**
 * @(#) Figure.java
 */

package Chess;

import javax.swing.ImageIcon;

public abstract class Figure
{
    private String color;
    private ImageIcon image;
    public Figure( ) {}

    //konstruktorius reikalingas prototipui
    public Figure( Figure f )
    {
        if (f != null)
        {
            this.color = f.color;
        }
    }

    public abstract void validMoves( );

    //abstraktus klonavimo metodas. Prototipo sablonui
    public abstract Figure clone( );
    
    public abstract String getFigureSign( );

    public String getColor( ) {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }
    
    public void setImage(ImageIcon image){
        this.image = image;
    }
    
    public ImageIcon getImage(){
        return this.image;
    }
    
    public abstract void Accept(Visitor v);
}
