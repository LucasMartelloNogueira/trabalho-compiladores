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
        System.out.println("TermNode");
        if (left != null) left.print();
        if (mulop != null) mulop.print();
        if (factor != null) factor.print();
        if (single != null) single.print();
    }
}
