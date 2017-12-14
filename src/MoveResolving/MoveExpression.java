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
public class MoveExpression implements Expression<MoveContext> {
    
    private final FigureExpression figureExp = new FigureExpression();
    private final SimpleMoveExpression simpleMoveExp = new SimpleMoveExpression();
    
    @Override
    public MoveContext interpret(String context)
    {
        MoveContext moveContext = null;

        Pattern pattern = Pattern.compile("^([PQKBRN]?)(.*)");
        Matcher matcher = pattern.matcher(context);
        
        if (matcher.matches()) {
            String figureMatch = matcher.group(1);
            String simpleMoveMatch = matcher.group(2);

            String figure = figureExp.interpret(figureMatch);
            MoveContext simpleMove = simpleMoveExp.interpret(simpleMoveMatch);

            if (figure != null && simpleMove != null) {
                moveContext = simpleMove;
                moveContext.setFigure(figure);
            }
        }
        
        return moveContext;
    }
}
