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
        System.out.println("IterationStmtNode");
        if (condition != null) condition.print();
        if (body != null) body.print();
    }
}
