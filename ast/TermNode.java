package ast;

public class TermNode extends ASTNode{
    private TermNode left;
    private MulopNode mulop;
    private FactorNode factor;
    private FactorNode single;

    public TermNode(FactorNode single) {
        this.single = single;
    }

    public TermNode(TermNode left, MulopNode mulop, FactorNode factor) {
        this.left = left;
        this.mulop = mulop;
        this.factor = factor;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (left != null) left.printHelper(depth);
        if (mulop != null) mulop.printHelper(depth);
        if (factor != null) factor.printHelper(depth);
        if (single != null) single.printHelper(depth);
    }
}
