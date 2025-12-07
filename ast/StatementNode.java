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
        System.out.println("StatementNode");
        if (exprStmt != null) exprStmt.print();
        if (compoundStmt != null) compoundStmt.print();
        if (selectionStmt != null) selectionStmt.print();
        if (iterationStmt != null) iterationStmt.print();
        if (returnStmt != null) returnStmt.print();
    }
}
