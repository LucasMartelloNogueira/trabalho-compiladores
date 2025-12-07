package ast;

public class ParamsNode extends ASTNode{
    private ParamListNode list;
    private boolean isVoid;

    public ParamsNode(ParamListNode list) {
        this.list = list;
    }

    public ParamsNode(boolean isVoid) {
        this.isVoid = isVoid;
    }

    @Override
    public void print() {
        System.out.println("ParamsNode");
        if (isVoid) System.out.println("VOID");
        if (list != null) list.print();
    }
}
