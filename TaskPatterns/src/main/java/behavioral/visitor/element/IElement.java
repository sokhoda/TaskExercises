package behavioral.visitor.element;

import behavioral.visitor.visitor.IComputerVisitor;

public interface IElement {
	void accept(IComputerVisitor visitor);
}
