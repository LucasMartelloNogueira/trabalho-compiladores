package ast;

public class ProgramNode extends ASTNode{
    
    private DeclarationListNode list;
    
    public ProgramNode(DeclarationListNode list) {
        this.list = list;
    }

    @Override
    public void print() {
        if (list != null) {
            list.printHelper(0);
        }
    }

    public void printHelper(int depth) {
        if (list != null) {
            list.printHelper(depth);
        }
    }

}
