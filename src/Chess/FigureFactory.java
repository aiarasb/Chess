/**
 * @(#) FigureFactory.java
 */

package Chess;

public class FigureFactory extends AbstractFactory
{
    @Override
    public Figure getFigure( String type )
    {
        if(type == null){
            return null;
        }
        else if(type.equalsIgnoreCase("1")){
            return new Queen(null);
        }
        else if(type.equalsIgnoreCase("2")){
            return new King(null);
        }
        else if(type.equalsIgnoreCase("3")){
            return new Knight(null);
        }
        else if(type.equalsIgnoreCase("4")){
            return new Rook(null);
        }
        else if(type.equalsIgnoreCase("5")){
            return new Bishop(null);
        }
        else if(type.equalsIgnoreCase("6")){
            return new Pawn(null);
        }
    
        return null;
    }

    @Override
    public Cell getCell(String color) {
        return null;
    }
    
    
}
