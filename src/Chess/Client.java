/**
 * @(#) Client.java
 */

package Chess;

import java.util.Scanner;

public class Client
{
    private static Game game = new Game();
    
    private static Scanner scanner;
    
    public static void main( String[] args )
    {
        scanner = new Scanner(System.in);
        scanner.reset();
        
        while (true) {
            System.out.println("What you want to demonstrate? (type 'quit' to end demonstration)");
            System.out.println("factory, command");
            
            switch(scanner.nextLine()) {
                case "quit":
                    return;
                case "factory":
                    demonstrateFactory();
                    break;
                case "command":
                    demonstrateCommand();
                    break;
            }
        }
    }
    
	/** To demonstrate Factory design pattern*/
    public static void demonstrateFactory(){
        System.out.println("Select Cell color: B - black; W - white;");
        String cellColor = scanner.nextLine();
        CellFactory cellFac = new CellFactory();
        Cell cell = cellFac.getCell(cellColor);
        System.out.println(cell.toString());
        
        System.out.println("Select figure type : 1 - Queen; 2 - King; 3 - Knight; 4 - Rook; 5 - Bishop; 6 - Pawn;");
        String figureType = scanner.nextLine();
        FigureFactory figFac = new FigureFactory();
        Figure figure = figFac.getFigure(figureType);
        System.out.println(figure.toString());
    }
    
    /** To demonstrate Command design pattern*/
    public static void demonstrateCommand(){
        System.out.println("Which command do you want to execute? (S)TART GAME or (U)NDO MOVE");
        String com = scanner.nextLine();
        if(com.equalsIgnoreCase("S")){
            game.startGame();
        }
        else if(com.equalsIgnoreCase("U")){
            game.undoMove();
        }
    }
    
}
