package visitor.element;

import visitor.visitor.IComputerVisitor;

public class CPU implements IElement {
	private static int count;
	private int id;

	public CPU() {
		id = count++;
	}

	@Override
	public void accept(IComputerVisitor visitor) {
		visitor.visit(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
