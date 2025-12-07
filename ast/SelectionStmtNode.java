package ast;

public class SelectionStmtNode extends ASTNode{
    private ExpressionNode condition;
    private StatementNode thenStmt;
    private StatementNode elseStmt;

    public SelectionStmtNode(ExpressionNode condition, StatementNode thenStmt) {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = null;
    }

    public SelectionStmtNode(ExpressionNode condition, StatementNode thenStmt, StatementNode elseStmt) {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
    }

    @Override
    public void print() {
        System.out.println("SelectionStmtNode");
        if (condition != null) condition.print();
        if (thenStmt != null) thenStmt.print();
        if (elseStmt != null) elseStmt.print();
    }
}
