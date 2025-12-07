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
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (list != null) list.printHelper(depth);
        if (expression != null) expression.printHelper(depth);
    }
}
