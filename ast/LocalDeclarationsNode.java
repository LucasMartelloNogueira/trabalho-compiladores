package ast;

public class LocalDeclarationsNode extends ASTNode{
    private LocalDeclarationsNode list;
    private VarDeclarationNode varDecl; // when not empty

    public LocalDeclarationsNode() {
        // empty
    }

    public LocalDeclarationsNode(LocalDeclarationsNode list, VarDeclarationNode varDecl) {
        this.list = list;
        this.varDecl = varDecl;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (list != null) list.printHelper(depth);
        if (varDecl != null) varDecl.printHelper(depth);
    }
}
