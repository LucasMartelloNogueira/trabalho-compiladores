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
        printHelper(0);
    }

    public void printHelper(int depth) {
        indent(depth);
        if (isVoid) {
            System.out.println("PARAMS: VOID");
        }
        if (list != null) {
            System.out.println("PARAMS: ");
            list.printHelper(depth);   
        }
    }
}
