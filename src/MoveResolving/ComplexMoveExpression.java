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
public class ComplexMoveExpression implements Expression<MoveContext> {
    
    private final PossitionExpression possitionExp = new PossitionExpression();
    private final CaptureExpression captureExp = new CaptureExpression();
    private final FromPosExpression fromPosExp = new FromPosExpression();
    private final EnPessantExpression enPessantExp = new EnPessantExpression();
    
    @Override
    public MoveContext interpret(String context)
    {
        MoveContext moveContext = null;

        Pattern pattern = Pattern.compile("^([a-f1-8]?)([x\\:]?)([a-f][1-8])((e\\.p\\.?)?)$");
        Matcher matcher = pattern.matcher(context);
        
        if (matcher.matches()) {
            String fromPosMatch = matcher.group(1);
            String captureMatch = matcher.group(2);
            String possitionMatch = matcher.group(3);
            String enPessantMatch = matcher.group(4);

            Integer[] fromPos = fromPosExp.interpret(fromPosMatch);
            Boolean isCapture = captureExp.interpret(captureMatch);
            Integer[] possition = possitionExp.interpret(possitionMatch);
            Boolean isEnPessant = enPessantExp.interpret(enPessantMatch);

            if (possition != null) {
                moveContext = new MoveContext();
                moveContext.setPossitionX(possition[0]);
                moveContext.setPossitionY(possition[1]);
                
                if (fromPos != null) {
                    moveContext.setPossitionFromX(fromPos[0]);
                    moveContext.setPossitionFromY(fromPos[1]);
                }
                
                if (isEnPessant) {
                    moveContext.setMoveType("En Pessant");
                } else if (isCapture) {
                    moveContext.setMoveType("Capture");
                }
            }
        }
        
        return moveContext;
    }
}
