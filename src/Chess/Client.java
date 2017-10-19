/**
 * @(#) Client.java
 */

package Chess;

public class Client
{
    private Game game = new Game();
    
    public static void main( String[] args )
    {
        
    }
    
	/** To demonstrate Factory design pattern*/
    public static void demonstrateFactory(){
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        String figureType = "";
        String cellColor = "";
        System.out.println("Select Cell color: B - black; W - white;");
        cellColor = scanner.nextLine();
        CellFactory cellFac = new CellFactory();
        Cell cell = cellFac.getCell(cellColor);
        System.out.println(cell.toString());
        
        System.out.println("Select figure type : 1 - Queen; 2 - King; 3 - Knight; 4 - Rook; 5 - Bishop; 6 - Pawn;");
        figureType = scanner.nextLine();
        FigureFactory figFac = new FigureFactory();
        Figure figure = figFac.getFigure(figureType);
        System.out.println(figure.toString());
    }
    
    /** To demonstrate Command design pattern*/
    public static void demonstrateCommand(){
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.println("Which command do you want to execute? (S)TART GAME or (U)NDO MOVE");
        String com = "";
        com = scanner.nextLine();
        if(com.equalsIgnoreCase("S")){
            game.startGame();
        }
        else if(com.equalsIgnoreCase("U")){
            game.undoMove();
        }
    }
    
}
