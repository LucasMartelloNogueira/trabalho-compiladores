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
		printHelper(0);
	}

	public void printHelper(int depth) {
		if (type != null) type.printHelper(depth);
		// indent(depth + 1);
		System.out.print("ID: " + id);
		if (arraySize != null) System.out.print("[" + arraySize + "]");
		System.out.println();
	}
}
