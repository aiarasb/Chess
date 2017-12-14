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
            System.out.println("What you want to demonstrate? (type 'q' to end demonstration)");
            System.out.println("1 - singleton, 2 - abstract factory, 3 - factory, 4 - strategy");
            System.out.println("5 - adapter, 6 - command, 7 - prototype, 8 - bridge");
            
            switch(scanner.nextLine()) {
                case "q":
                    return;
                case "1":
                    demonstrateSingleton();
                    break;
                case "2":
                    demonstrateAbstractFactory();
                    break;
                case "3":
                    demonstrateFactory();
                    break;
                case "4":
                    demonstrateStrategy();
                    break;
                case "5":
                    demonstrateAdapter();
                    break;
                case "6":
                    demonstrateCommand();
                    break;
                case "7":
                    demonstratePrototype();
                    break;
                case "8":
                    demonstrateBridge();
                    break;
            }
        }
    }
    
    public static void demonstrateSingleton( ) {
        Board board = Board.getInstance();
        System.out.println(board.toString());
    }
    
    public static void demonstrateAbstractFactory( ) {
        FactoryProducer producer = new FactoryProducer();
        
        System.out.println("What factory do you want to create?");
        System.out.println("figure, cell");
        AbstractFactory factory = producer.getFactory(scanner.nextLine());
        
        System.out.println(factory.toString());
        System.out.println("Created cell: "+factory.getCell("W"));
        System.out.println("Created figure: "+factory.getFigure("1"));
    }
    
    public static void demonstrateStrategy( ) {
        game.setBlackPlayer(new ComputerPlayer());
        game.setWhitePlayer(new HumanPlayer());
        
        game.startGame();
    }
    
    public static void demonstrateAdapter( ) {
        ComputerPlayer player = new ComputerPlayer();
        player.getMove();
    }
    
    public static void demonstratePrototype( ) {
        Board board = Board.getInstance();
        board.setup();
        board.draw();
    }
    
    public static void demonstrateBridge( ) {
        System.out.println("Please check the code");
    }
    
	/**
     * To demonstrate Factory design pattern
     */
    public static void demonstrateFactory( ){
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
    
    /**
     * To demonstrate Command design pattern
     */
    public static void demonstrateCommand( ){
        ComputerPlayer player = new ComputerPlayer();
        AbsMove move = player.getMove();
        
        move.execute();
    }
    
}
