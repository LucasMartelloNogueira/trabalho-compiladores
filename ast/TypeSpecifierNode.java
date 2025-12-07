package ast;

public class TypeSpecifierNode extends ASTNode{
    private String type; // INT, VOID

    public TypeSpecifierNode(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("TypeSpecifierNode: " + type);
    }
}
