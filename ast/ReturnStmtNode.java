package ast;

public class ReturnStmtNode extends ASTNode{
    private ExpressionNode expression;
    private boolean isEmpty;

    public ReturnStmtNode() {
        this.isEmpty = true;
    }

    public ReturnStmtNode(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public void print() {
        System.out.println("ReturnStmtNode");
        if (isEmpty) System.out.println("return;");
        if (expression != null) expression.print();
    }
}
