/**
 * @(#) Board.java
 */

package Chess;

public class Board
{
    private static Board instance = new Board();
    
    private Pawn pawnPrototype;
    
    private FactoryProducer factoryProducer;
    
    private Board( )
    {
        
    }
    
    public static Board getInstance( )
    {
        return instance;
    }

    public FactoryProducer getFactoryProducer() {
        return factoryProducer;
    }

    public void setFactoryProducer(FactoryProducer factoryProducer) {
        this.factoryProducer = factoryProducer;
    }
    
    public void setup( )
    {
        
    }
    
    
}
