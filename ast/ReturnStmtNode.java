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
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth + 1);
        System.out.println("RETURN");
        if (expression != null) expression.printHelper(depth + 1);
    }
}
