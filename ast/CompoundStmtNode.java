package ast;

public class CompoundStmtNode extends ASTNode{
    private LocalDeclarationsNode localDeclarations;
    private StatementListNode statementList;

    public CompoundStmtNode(LocalDeclarationsNode localDeclarations, StatementListNode statementList) {
        this.localDeclarations = localDeclarations;
        this.statementList = statementList;
    }

    @Override
    public void print() {
        System.out.println("CompoundStmtNode");
        if (localDeclarations != null) localDeclarations.print();
        if (statementList != null) statementList.print();
    }
}
