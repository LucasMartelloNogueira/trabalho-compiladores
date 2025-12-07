package ast;

public class CallNode extends ASTNode{
    private String id;
    private ArgsNode args;

    public CallNode(String id, ArgsNode args) {
        this.id = id;
        this.args = args;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth + 1);
        System.out.println("CALL: " + id);
        if (args != null) args.printHelper(depth + 1);
    }
}
