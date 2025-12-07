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
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth + 1);
        System.out.println("ID: " + id);
        if (index != null) index.printHelper(depth + 1);
    }
}
