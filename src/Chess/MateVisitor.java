/**
 * @(#) MateVisitor.java
 */
package Chess;

public class MateVisitor extends Visitor{

    @Override
    public void visit(Figure f) {
        System.out.println("Rodomas matas (per visitor)");
    }
    
}
