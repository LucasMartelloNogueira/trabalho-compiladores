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
        System.out.println("ArgsNode");
        if (isEmpty) System.out.println("empty args");
        if (argList != null) argList.print();
    }
}
