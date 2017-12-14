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
public class NumberExpression implements Expression<Integer> {
    private static final Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("1", 1);
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
    }};
    
    @Override
    public Integer interpret(String context)
    {
        return map.get(context);
    }
}
