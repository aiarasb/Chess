/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveResolving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aiara
 */
public class MainMoveExpression implements Expression<MoveContext> {
    
    private final CastlingExpression castlingExp = new CastlingExpression();
    private final PromotionExpression promotionExp = new PromotionExpression();
    private final MoveExpression moveExp = new MoveExpression();
    
    @Override
    public MoveContext interpret(String context)
    {
        MoveContext moveContext = castlingExp.interpret(context);
        
        if (moveContext == null) {
            moveContext = promotionExp.interpret(context);
        }
        
        if (moveContext == null) {
            moveContext = moveExp.interpret(context);
        }
        
        return moveContext;
    }
}
