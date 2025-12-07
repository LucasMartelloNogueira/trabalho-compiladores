package ast;

public class TypeSpecifierNode extends ASTNode{
    private String type; // INT, VOID

    public TypeSpecifierNode(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth + 1);
        System.out.print(type + " ");
    }
}
