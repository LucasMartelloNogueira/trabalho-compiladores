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
        if (isVoid) {
            // indent(depth + 1);
            // System.out.print("PARAMS: ");
            System.out.println("PARAMS: VOID");
        }
        if (list != null) {
            indent(depth);
            System.out.println("PARAMS: ");
            list.printHelper(depth);   
        }
    }
}
