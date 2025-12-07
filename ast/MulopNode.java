package ast;

public class MulopNode extends ASTNode{
    private String op; // "*" or "/"

    public MulopNode(String op) {
        this.op = op;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth + 1);
        System.out.println(op);
    }
}
