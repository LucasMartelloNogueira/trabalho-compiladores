package ast;

public class ParamListNode extends ASTNode{
    private ParamListNode list;
    private ParamNode param;

    public ParamListNode(ParamListNode list, ParamNode param) {
        this.list = list;
        this.param = param;
    }

    public ParamListNode(ParamNode param) {
        this.param = param;
    }

    @Override
    public void print() {
        if (list != null) list.printHelper(0);
        if (param != null) param.printHelper(0);
    }

    public void printHelper(int depth) {
        if (list != null) list.printHelper(depth);
        if (param != null) param.printHelper(depth);
    }
}
