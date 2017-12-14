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
public class FromPosExpression implements Expression<Integer[]> {
    
    private final NumberExpression numberExp = new NumberExpression();
    private final LetterExpression letterExp = new LetterExpression();
    
    @Override
    public Integer[] interpret(String context)
    {
        Integer[] fromPos = null;

        if (context.length() == 2) {
            Integer x = numberExp.interpret(context);
            Integer y = letterExp.interpret(context);
            
            if (x != null) {
                fromPos = new Integer[]{x,0};
            } else if (y != null) {
                fromPos = new Integer[]{0,y};
            }
        }
        
        return fromPos;
    }
}
