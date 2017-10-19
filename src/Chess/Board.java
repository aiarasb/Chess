/**
 * @(#) Board.java
 */

package Chess;

public class Board
{
    private static Board instance = new Board();
    
    private Pawn pawnPrototype;
    
    private FactoryProducer factoryProducer;
    
    private Cell[][] gameBoard = new Cell[8][8];
    
    private Board( )
    {
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++) {
                Position pos = new Position(x, y);
                Cell cell;
                
                if ((x+y)%2==0) {
                    cell = new BlackCell();
                } else {
                    cell = new WhiteCell();
                }
                
                cell.setPosition(pos);
                gameBoard[x][y] = cell;
            }
        }
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
        String[][] boardConfig = new String[][]{
            {"B4","B3","B5","B1","B2","B5","B3","B4"},
            {"B6","B6","B6","B6","B6","B6","B6","B6"},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"W6","W6","W6","W6","W6","W6","W6","W6"},
            {"W4","W3","W5","W2","W1","W5","W3","W4"},
        };
        FigureFactory factory = new FigureFactory();
        
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++) {
                if (boardConfig[x][y].length() == 2) {
                    String figType = ""+boardConfig[x][y].charAt(1);
                    Figure fig;

                    if (figType.equals("6")) {
                        fig = getPawn();
                    } else {
                        fig = factory.getFigure(figType);
                    }

                    fig.setColor(""+boardConfig[x][y].charAt(0));
                    gameBoard[x][y].setFigure(fig);
                }
            }
        }
    }
    
    public void draw()
    {
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++) {
                System.out.println("Cell: "+gameBoard[x][y]);
                if (gameBoard[x][y].getFigure() != null)
                    System.out.println("Figure at "+x+","+y+": "+gameBoard[x][y].getFigure()+", figure color:"+gameBoard[x][y].getFigure().getColor());
            }
        }
    }
    
    private Pawn getPawn()
    {
        if (pawnPrototype == null) {
            pawnPrototype = new Pawn(null);
        }
        
        return pawnPrototype.clone();
    }
}
