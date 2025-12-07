package ast;

public class ParamNode extends ASTNode{
    private TypeSpecifierNode type;
    private String id;
    private boolean isArray;

    public ParamNode(TypeSpecifierNode type, String id) {
        this.type = type;
        this.id = id;
    }

    public ParamNode(TypeSpecifierNode type, String id, boolean isArray) {
        this.type = type;
        this.id = id;
        this.isArray = isArray;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (type != null) type.printHelper(depth);
        // indent(depth + 1);
        System.out.println("ID: " + id + (isArray ? "[]" : ""));
    }
}
