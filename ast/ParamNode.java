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
        System.out.println("ParamNode: " + id + (isArray ? "[]" : ""));
        if (type != null) type.print();
    }
}
