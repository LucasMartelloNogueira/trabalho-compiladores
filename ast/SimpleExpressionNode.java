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
        System.out.println("SimpleExpressionNode");
        if (left != null) left.print();
        if (relop != null) relop.print();
        if (right != null) right.print();
        if (single != null) single.print();
    }
}
