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
        System.out.println("DeclarationListNode");
        if (list != null) list.print();
        if (declaration != null) declaration.print();
    }

}
