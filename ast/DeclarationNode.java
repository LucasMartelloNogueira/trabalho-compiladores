package ast;

import java.util.Optional;

public class DeclarationNode extends ASTNode{
    private Optional<VarDeclarationNode> varDecl;
    private Optional<FunDeclarationNode> funDecl;

    public DeclarationNode(VarDeclarationNode varDecl) {
        this.varDecl = Optional.ofNullable(varDecl);
        this.funDecl = Optional.empty();
    }

    public DeclarationNode(FunDeclarationNode funDecl) {
        this.varDecl = Optional.empty();
        this.funDecl = Optional.ofNullable(funDecl);
    }

    @Override
    public void print() {
        System.out.println("DeclarationNode");
        if (varDecl.isPresent()) varDecl.get().print();
        if (funDecl.isPresent()) funDecl.get().print();
    }

}
