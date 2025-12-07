package ast;

public class MulopNode extends ASTNode{
    private String op; // "*" or "/"

    public MulopNode(String op) {
        this.op = op;
    }

    @Override
    public void print() {
        System.out.println("MulopNode: " + op);
    }
}
