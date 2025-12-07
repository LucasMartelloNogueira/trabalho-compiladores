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
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (varAssign != null) varAssign.printHelper(depth);
        if (assignedExpr != null) {
            indent(depth + 1);
            System.out.println(" =");
            assignedExpr.printHelper(depth + 1);
        }
        if (simpleExpression != null) simpleExpression.printHelper(depth);
    }
}
