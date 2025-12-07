package ast;

public class ProgramNode extends ASTNode{
    
    private DeclarationListNode list;
    
    public ProgramNode(DeclarationListNode list) {
        this.list = list;
    }

    @Override
    public void print() {
        System.out.println("ProgramNode");
        if (list != null) {
            list.print();
        }
    }

}
