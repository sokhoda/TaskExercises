package visitor.element;

import visitor.visitor.IComputerVisitor;

public class Memory implements IElement {

	@Override
	public void accept(IComputerVisitor visitor) {
		visitor.visit(this);
	}

}
