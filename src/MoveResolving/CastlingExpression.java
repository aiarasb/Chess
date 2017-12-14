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
public class CastlingExpression implements Expression<MoveContext> {
    
    @Override
    public MoveContext interpret(String context)
    {
        MoveContext moveContext = null;

        if (context.equals("0-0")) {
            moveContext = new MoveContext();
            moveContext.setMoveType("Castling Short");
        } else if (context.equals("0-0-0")) {
            moveContext = new MoveContext();
            moveContext.setMoveType("Castling Long");
        }
        
        return moveContext;
    }
}
