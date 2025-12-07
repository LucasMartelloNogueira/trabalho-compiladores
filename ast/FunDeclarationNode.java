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
        System.out.println("FunDeclarationNode: " + id);
        if (type != null) type.print();
        if (params != null) params.print();
        if (body != null) body.print();
    }
}
