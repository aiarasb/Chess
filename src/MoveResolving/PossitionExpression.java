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
public class PossitionExpression implements Expression<Integer[]> {
    
    private final NumberExpression numberExp = new NumberExpression();
    private final LetterExpression letterExp = new LetterExpression();
    
    @Override
    public Integer[] interpret(String context)
    {
        Integer[] fromPos = null;

        if (context.length() == 2) {
            String number = context.substring(1);
            Integer x = numberExp.interpret(number);
            String letter = context.substring(0, 1);
            Integer y = letterExp.interpret(letter);
            
            if (x != null && y != null) {
                fromPos = new Integer[]{x,y};
            }
        }
        
        return fromPos;
    }
}
