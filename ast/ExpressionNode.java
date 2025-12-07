package ast;

public class ExpressionNode extends ASTNode{
    private VarNode varAssign;
    private ExpressionNode assignedExpr;

    private SimpleExpressionNode simpleExpression;

    // var ASSIGN expression
    public ExpressionNode(VarNode varAssign, ExpressionNode assignedExpr) {
        this.varAssign = varAssign;
        this.assignedExpr = assignedExpr;
    }

    // simple_expression
    public ExpressionNode(SimpleExpressionNode simpleExpression) {
        this.simpleExpression = simpleExpression;
    }

    @Override
    public void print() {
        System.out.println("ExpressionNode");
        if (varAssign != null) varAssign.print();
        if (assignedExpr != null) assignedExpr.print();
        if (simpleExpression != null) simpleExpression.print();
    }
}
