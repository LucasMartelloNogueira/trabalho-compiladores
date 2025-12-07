package ast;

public class RelopNode extends ASTNode{
    private String op; // "<=", "<", ">", ">=", "==", "!="

    public RelopNode(String op) {
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
