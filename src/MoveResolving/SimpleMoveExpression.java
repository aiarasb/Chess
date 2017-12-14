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
public class SimpleMoveExpression implements Expression<MoveContext> {
    
    private final PossitionExpression possitionExp = new PossitionExpression();
    private final ComplexMoveExpression complexMoveExp = new ComplexMoveExpression();
    
    @Override
    public MoveContext interpret(String context)
    {
        MoveContext moveContext = null;

        Pattern pattern = Pattern.compile("^([a-f][1-8])$");
        Matcher matcher = pattern.matcher(context);
        
        if (matcher.matches()) {
            String possitionMatch = matcher.group(1);

            Integer[] possition = possitionExp.interpret(possitionMatch);

            if (possition != null) {
                moveContext = new MoveContext();
                moveContext.setPossitionX(possition[0]);
                moveContext.setPossitionY(possition[1]);
                
                moveContext.setMoveType("Move");
            }
        } else {
            moveContext = complexMoveExp.interpret(context);
        }
        
        return moveContext;
    }
}
