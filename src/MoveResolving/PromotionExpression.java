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
public class PromotionExpression implements Expression<MoveContext> {
    
    private final PossitionExpression possitionExp = new PossitionExpression();
    private final PawnExpression pawnExp = new PawnExpression();
    private final MajorFigureExpression majorFigureExp = new MajorFigureExpression();
    
    @Override
    public MoveContext interpret(String context)
    {
        MoveContext moveContext = null;

        Pattern pattern = Pattern.compile("^(P?)([a-f][1-8])(\\([KQBNR]\\)|[\\=\\/]?[KQBNR])$");
        Matcher matcher = pattern.matcher(context);
        
        if (matcher.matches()) {
            String pawnMatch = matcher.group(1);
            String possitionMatch = matcher.group(2);
            String promotedToMatch = matcher.group(3);

            String pawn = pawnExp.interpret(pawnMatch);
            Integer[] possition = possitionExp.interpret(possitionMatch);
            String promotedTo = majorFigureExp.interpret(promotedToMatch);

            if (pawn.equals("Pawn") && possition != null && promotedTo != null) {
                moveContext = new MoveContext();
                moveContext.setMoveType("Promotion");
                moveContext.setPromotionTarget(promotedTo);
                moveContext.setPossitionX(possition[0]);
                moveContext.setPossitionY(possition[1]);
            }
        }
        
        return moveContext;
    }
}
