/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveResolving;

import java.util.*;

/**
 *
 * @author aiara
 */
public class PawnExpression implements Expression<String> {
    private static final Map<String, String> map = new HashMap<String, String>() {{
        put("P", "Pawn");
        put("", "Pawn");
    }};
    
    @Override
    public String interpret(String context)
    {
        return map.get(context);
    }
}
