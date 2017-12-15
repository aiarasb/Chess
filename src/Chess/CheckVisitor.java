/**
 * @(#) CheckVisitor.java
 */
package Chess;

public class CheckVisitor extends Visitor {

    @Override
    public void visit(Figure f) {
        System.out.println("patikrinama, ar yra sachas (per visitor)");
    }
    
}
