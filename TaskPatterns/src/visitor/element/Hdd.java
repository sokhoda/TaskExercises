package visitor.element;

import visitor.visitor.IComputerVisitor;

public class Hdd implements IElement {

	@Override
	public void accept(IComputerVisitor visitor) {
		visitor.visit(this);

	}
}
