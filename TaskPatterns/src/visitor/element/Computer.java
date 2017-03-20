package visitor.element;

import java.util.ArrayList;

import visitor.visitor.IComputerVisitor;

public class Computer implements IElement {
	private ArrayList<IElement> computerParts;

	public Computer() {
		computerParts = new ArrayList<>();
		computerParts.add(new CPU());
		computerParts.add(new Memory());
		computerParts.add(new Hdd());
	}

	@Override
	public void accept(IComputerVisitor visitor) {
		for (IElement iElement : computerParts) {
			iElement.accept(visitor);
		}
		visitor.visit(this);
	}

}