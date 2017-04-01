package behavioral.visitor.element;

import behavioral.visitor.visitor.IComputerVisitor;

public class Hdd implements IElement {

	@Override
	public void accept(IComputerVisitor visitor) {
		visitor.visit(this);

	}
}
