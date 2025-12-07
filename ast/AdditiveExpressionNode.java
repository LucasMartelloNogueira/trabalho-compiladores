package ast;

public class AdditiveExpressionNode extends ASTNode{
    private AdditiveExpressionNode left;
    private AddopNode addop;
    private TermNode term;
    private TermNode single;

    public AdditiveExpressionNode(TermNode single) {
        this.single = single;
    }

    public AdditiveExpressionNode(AdditiveExpressionNode left, AddopNode addop, TermNode term) {
        this.left = left;
        this.addop = addop;
        this.term = term;
    }

    @Override
    public void print() {
        System.out.println("AdditiveExpressionNode");
        if (left != null) left.print();
        if (addop != null) addop.print();
        if (term != null) term.print();
        if (single != null) single.print();
    }
}
