package ast;

public class VarNode extends ASTNode{
    private String id;
    private ExpressionNode index; // null if simple ID

    public VarNode(String id) {
        this.id = id;
    }

    public VarNode(String id, ExpressionNode index) {
        this.id = id;
        this.index = index;
    }

    @Override
    public void print() {
        System.out.println("VarNode: " + id);
        if (index != null) index.print();
    }
}
