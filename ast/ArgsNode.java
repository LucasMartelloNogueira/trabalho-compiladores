package ast;

public class ArgsNode extends ASTNode{
    private ArgListNode argList;
    private boolean isEmpty;

    public ArgsNode() {
        this.isEmpty = true;
    }

    public ArgsNode(ArgListNode argList) {
        this.argList = argList;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (argList != null) argList.printHelper(depth);
    }
}
