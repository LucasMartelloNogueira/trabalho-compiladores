package ast;

public class AddopNode extends ASTNode{
    private String op; // "+" or "-"

    public AddopNode(String op) {
        this.op = op;
    }

    @Override
    public void print() {
        System.out.println("AddopNode: " + op);
    }
}
