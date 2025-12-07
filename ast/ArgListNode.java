package ast;

public class ArgListNode extends ASTNode{
    private ArgListNode list;
    private ExpressionNode expression;

    public ArgListNode(ExpressionNode expression) {
        this.expression = expression;
    }

    public ArgListNode(ArgListNode list, ExpressionNode expression) {
        this.list = list;
        this.expression = expression;
    }

    @Override
    public void print() {
        System.out.println("ArgListNode");
        if (list != null) list.print();
        if (expression != null) expression.print();
    }
}
