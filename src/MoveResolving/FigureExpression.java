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
public class FigureExpression implements Expression<String> {
    
    private final MajorFigureExpression majorFigureExp = new MajorFigureExpression();
    private final PawnExpression pawnExp = new PawnExpression();
    
    @Override
    public String interpret(String context)
    {
        String figure = majorFigureExp.interpret(context);

        if (figure == null) {
            figure = pawnExp.interpret(context);
        }
        
        return figure;
    }
}
