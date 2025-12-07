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
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth + 1);
        System.out.println("IF");
        if (condition != null) condition.printHelper(depth + 2);
        if (thenStmt != null) thenStmt.printHelper(depth + 1);
        if (elseStmt != null) {
            indent(depth + 1);
            System.out.println("ELSE");
            elseStmt.printHelper(depth + 2);
        }
    }
}
