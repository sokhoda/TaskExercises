package behavioral.visitor.element;

import behavioral.visitor.visitor.IComputerVisitor;

public class Memory implements IElement {

	@Override
	public void accept(IComputerVisitor visitor) {
		visitor.visit(this);
	}

}
