package ast;

import java.util.Optional;

public class VarDeclarationNode extends ASTNode{
	private TypeSpecifierNode type;
	private String id;
	private Integer arraySize;

	public VarDeclarationNode(TypeSpecifierNode type, String id) {
		this.type = type;
		this.id = id;
        this.arraySize = null;
	}

	public VarDeclarationNode(TypeSpecifierNode type, String id, int arraySize) {
		this.type = type;
		this.id = id;
		this.arraySize = arraySize;
	}

	@Override
	public void print() {
		System.out.println("VarDeclarationNode: id=" + id);
		if (type != null) type.print();
		if (arraySize != null) System.out.println("arraySize=" + arraySize);
	}
}
