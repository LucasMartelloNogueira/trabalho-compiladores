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
        System.out.println("ParamListNode");
        if (list != null) list.print();
        if (param != null) param.print();
    }
}
