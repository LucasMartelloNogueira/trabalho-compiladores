package ast;

public class FactorNode extends ASTNode{
    private ExpressionNode parenExpr;
    private VarNode var;
    private CallNode call;
    private Integer num;

    public FactorNode(ExpressionNode parenExpr) {
        this.parenExpr = parenExpr;
    }

    public FactorNode(VarNode var) {
        this.var = var;
    }

    public FactorNode(CallNode call) {
        this.call = call;
    }

    public FactorNode(Integer num) {
        this.num = num;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (parenExpr != null) parenExpr.printHelper(depth);
        if (var != null) var.printHelper(depth);
        if (call != null) call.printHelper(depth);
        if (num != null) {
            indent(depth);
            System.out.println("NUM: " + num);
        }
    }
}
