/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveResolving;

/**
 *
 * @author aiara
 */
public class MoveResolver {
    private final MainMoveExpression moveExpression;

    public MoveResolver() {
        this.moveExpression = new MainMoveExpression();
    }
    
    public Chess.AbsMove resolve (String move) throws Exception
    {
        MoveContext moveContext = moveExpression.interpret(move);
        Chess.AbsMove moveObj = null;
        
        if (moveContext != null) {
            switch (moveContext.getMoveType()) {
                case "Move":
                    moveObj= this.createMove(moveContext);
                    break;
                case "Castling Long":
                    moveObj = this.createCastling(moveContext);
                    break;
                case "Castling Short":
                    moveObj = this.createCastling(moveContext);
                    break;
                case "En Pessant":
                    moveObj = this.createEnPessant(moveContext);
                    break;
                case "Capture":
                    moveObj = this.createCapture(moveContext);
                    break;
                case "Promotion":
                    moveObj = this.createPromotion(moveContext);
                    break;
                default:
                    throw new Exception("Bad move");
            }
        } else {
            throw new Exception("Bad move");
        }
        
        return moveObj;
    }
    
    private Chess.AbsMove createMove(MoveContext context) {
        Chess.AbsMove move = new Chess.Move(null, null, null);
        
        return move;
    }
    
    private Chess.AbsMove createCastling(MoveContext context) {
        Chess.AbsMove move = new Chess.Castling(null, null, null, null, null, null);
        
        return move;
    }
    
    private Chess.AbsMove createEnPessant(MoveContext context) {
        Chess.AbsMove move = new Chess.EnPessant(null, null, null);
        
        return move;
    }
    
    private Chess.AbsMove createCapture(MoveContext context) {
        Chess.AbsMove move = new Chess.Move(null, null, null);
        
        return move;
    }
    
    private Chess.AbsMove createPromotion(MoveContext context) {
        Chess.AbsMove move = new Chess.Promotion(null, null, null, null);
        
        return move;
    }
}
