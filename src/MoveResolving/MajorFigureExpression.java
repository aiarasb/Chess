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
public class MajorFigureExpression implements Expression<String> {
    private static final Map<String, String> map = new HashMap<String, String>() {{
        put("K", "King");
        put("Q", "Queen");
        put("R", "Rook");
        put("N", "Knight");
        put("B", "Bishop");
    }};
    
    @Override
    public String interpret(String context)
    {
        return map.get(context);
    }
}
