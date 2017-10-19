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
            return new Queen();
        }
        else if(type.equalsIgnoreCase("2")){
            return new King();
        }
        else if(type.equalsIgnoreCase("3")){
            return new Knight();
        }
        else if(type.equalsIgnoreCase("4")){
            return new Rook();
        }
        else if(type.equalsIgnoreCase("5")){
            return new Bishop();
        }
        else if(type.equalsIgnoreCase("6")){
            return new Pawn();
        }
    
        return null;
    }

    @Override
    public Cell getCell(String color) {
        return null;
    }
    
    
}
