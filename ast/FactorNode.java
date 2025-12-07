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
        System.out.println("FactorNode");
        if (parenExpr != null) parenExpr.print();
        if (var != null) var.print();
        if (call != null) call.print();
        if (num != null) System.out.println("NUM: " + num);
    }
}
