package ast;

public class StatementListNode extends ASTNode{
    private StatementListNode list;
    private StatementNode statement;

    public StatementListNode() {
        // empty
    }

    public StatementListNode(StatementListNode list, StatementNode statement) {
        this.list = list;
        this.statement = statement;
    }

    @Override
    public void print() {
        printHelper(0);
    }

    public void printHelper(int depth) {
        if (list != null) list.printHelper(depth);
        if (statement != null) statement.printHelper(depth);
    }
}
