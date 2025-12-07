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
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (localDeclarations != null) localDeclarations.printHelper(depth + 1);
        if (statementList != null) statementList.printHelper(depth + 1);
    }
}
