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
        System.out.println("StatementListNode");
        if (list != null) list.print();
        if (statement != null) statement.print();
    }
}
