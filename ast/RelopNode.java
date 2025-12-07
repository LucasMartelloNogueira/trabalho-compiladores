package ast;

public class RelopNode extends ASTNode{
    private String op; // "<=", "<", ">", ">=", "==", "!="

    public RelopNode(String op) {
        this.op = op;
    }

    @Override
    public void print() {
        System.out.println("RelopNode: " + op);
    }
}
