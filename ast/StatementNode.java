package ast;

public class StatementNode extends ASTNode{
    private ExpressionStmtNode exprStmt;
    private CompoundStmtNode compoundStmt;
    private SelectionStmtNode selectionStmt;
    private IterationStmtNode iterationStmt;
    private ReturnStmtNode returnStmt;

    public StatementNode(ExpressionStmtNode exprStmt) { this.exprStmt = exprStmt; }
    public StatementNode(CompoundStmtNode compoundStmt) { this.compoundStmt = compoundStmt; }
    public StatementNode(SelectionStmtNode selectionStmt) { this.selectionStmt = selectionStmt; }
    public StatementNode(IterationStmtNode iterationStmt) { this.iterationStmt = iterationStmt; }
    public StatementNode(ReturnStmtNode returnStmt) { this.returnStmt = returnStmt; }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (exprStmt != null) exprStmt.printHelper(depth);
        if (compoundStmt != null) compoundStmt.printHelper(depth);
        if (selectionStmt != null) selectionStmt.printHelper(depth);
        if (iterationStmt != null) iterationStmt.printHelper(depth);
        if (returnStmt != null) returnStmt.printHelper(depth);
    }
}
