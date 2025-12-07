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
        System.out.println("CallNode: " + id);
        if (args != null) args.print();
    }
}
