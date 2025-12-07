package ast;

public class FunDeclarationNode extends ASTNode{
    private TypeSpecifierNode type;
    private String id;
    private ParamsNode params;
    private CompoundStmtNode body;

    public FunDeclarationNode(TypeSpecifierNode type, String id, ParamsNode params, CompoundStmtNode body) {
        this.type = type;
        this.id = id;
        this.params = params;
        this.body = body;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (type != null) type.printHelper(depth);
        // indent(depth + 1);
        System.out.println("FUNCTION: " + id);
        if (params != null) params.printHelper(depth + 1);
        if (body != null) body.printHelper(depth + 1);
    }
}
