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
public class LetterExpression implements Expression<Integer> {
    private static final Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("a", 1);
        put("b", 2);
        put("c", 3);
        put("d", 4);
        put("e", 5);
        put("f", 6);
        put("g", 7);
        put("h", 8);
    }};
    
    @Override
    public Integer interpret(String context)
    {
        return map.get(context);
    }
}
