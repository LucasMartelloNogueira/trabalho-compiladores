package ast;

public abstract class ASTNode {

    public static int space = 4;

    public void indent() {
        for (int i = 0; i < space; i++){
            System.out.print("-");
        }
    }

    public void indent(int n) {
        for (int i = 0; i < space * n; i++) {
            System.out.print("-");
        }
    }

    public abstract void print();
}
