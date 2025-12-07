package ast;

public class DeclarationListNode extends ASTNode{
    private DeclarationListNode list;
    private DeclarationNode declaration;


    public DeclarationListNode(DeclarationListNode list, DeclarationNode declaration) {
        this.list = list;
        this.declaration = declaration;
    }

    public DeclarationListNode(DeclarationNode declaration) {
        this.declaration = declaration;
    }

    @Override
    public void print() {
        if (list != null) list.printHelper(0);
        if (declaration != null) declaration.printHelper(0);
    }

    public void printHelper(int depth) {
        if (list != null) list.printHelper(depth);
        if (declaration != null) declaration.printHelper(depth);
    }

}
