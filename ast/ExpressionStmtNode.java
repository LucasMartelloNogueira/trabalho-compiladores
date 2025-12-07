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
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (isEmpty) {
            indent(depth + 1);
            System.out.println(";");
        }
        if (expression != null) expression.printHelper(depth);
    }
}
