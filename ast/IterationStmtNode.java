package ast;

public class IterationStmtNode extends ASTNode{
    private ExpressionNode condition;
    private StatementNode body;

    public IterationStmtNode(ExpressionNode condition, StatementNode body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth + 1);
        System.out.println("WHILE");
        if (condition != null) condition.printHelper(depth + 2);
        if (body != null) body.printHelper(depth + 1);
    }
}
