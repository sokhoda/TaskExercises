package visitor.element;

import visitor.visitor.IComputerVisitor;

public interface IElement {
	void accept(IComputerVisitor visitor);
}
