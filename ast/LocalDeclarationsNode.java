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
        System.out.println("LocalDeclarationsNode");
        if (list != null) list.print();
        if (varDecl != null) varDecl.print();
    }
}
