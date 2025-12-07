package ast;

public class SimpleExpressionNode extends ASTNode{
    private AdditiveExpressionNode left;
    private RelopNode relop;
    private AdditiveExpressionNode right;
    private AdditiveExpressionNode single;

    public SimpleExpressionNode(AdditiveExpressionNode single) {
        this.single = single;
    }

    public SimpleExpressionNode(AdditiveExpressionNode left, RelopNode relop, AdditiveExpressionNode right) {
        this.left = left;
        this.relop = relop;
        this.right = right;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (left != null) left.printHelper(depth);
        if (relop != null) relop.printHelper(depth);
        if (right != null) right.printHelper(depth);
        if (single != null) single.printHelper(depth);
    }
}
