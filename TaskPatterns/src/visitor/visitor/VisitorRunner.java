package visitor.visitor;

import visitor.element.Computer;

public interface VisitorRunner {
	public static void main(String[] args) {
		Computer computer = new Computer();
		IComputerVisitor displayVisitor = new ComputerDisplayVisitor();
		computer.accept(displayVisitor);
	}
}
