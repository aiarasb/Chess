/**
 * @(#) FactoryProducer.java
 */

package Chess;

public class FactoryProducer
{
    public final String FIGURE = "figure";
    public final String CELL = "cell";
    
    public AbstractFactory getFactory( String type )
    {
        AbstractFactory factory;
        
        switch (type) {
            case FIGURE:
                factory = new FigureFactory();
                break;
            case CELL:
                factory = new CellFactory();
                break;
            default:
                throw new TypeNotPresentException(type, null);
       }
        
        return factory;
    }
    
    
}
