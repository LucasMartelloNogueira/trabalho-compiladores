package ast;

public class ExpressionStmtNode extends ASTNode{
    private ExpressionNode expression;
    private boolean isEmpty;

    public ExpressionStmtNode() {
        this.isEmpty = true;
    }

    public ExpressionStmtNode(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public void print() {
        System.out.println("ExpressionStmtNode");
        if (isEmpty) System.out.println("empty expression stmt");
        if (expression != null) expression.print();
    }
}
