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
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (left != null) left.printHelper(depth);
        if (addop != null) addop.printHelper(depth);
        if (term != null) term.printHelper(depth);
        if (single != null) single.printHelper(depth);
    }
}
