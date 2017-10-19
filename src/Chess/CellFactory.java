/**
 * @(#) CellFactory.java
 */

package Chess;

public class CellFactory extends AbstractFactory
{
    @Override
    public Cell getCell( String color )
    {
        if(color == null){
            return null;
        }
        else if(color.equalsIgnoreCase("B")){
            return new BlackCell();
        }
        else if(color.equalsIgnoreCase("W")){
            return new WhiteCell();
        }
        
        return null;
    }

    @Override
    public Figure getFigure(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
