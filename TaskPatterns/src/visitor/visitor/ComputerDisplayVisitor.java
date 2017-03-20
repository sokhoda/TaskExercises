package visitor.visitor;

import visitor.element.CPU;
import visitor.element.Computer;
import visitor.element.Hdd;
import visitor.element.Memory;

public class ComputerDisplayVisitor implements IComputerVisitor {

	@Override
	public void visit(CPU cpu) {
		System.out.println("Visiting CPU #" + cpu.getId());
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("Visiting Computer");
	}

	@Override
	public void visit(Hdd hdd) {
		System.out.println("Visiting Hdd");

	}

	@Override
	public void visit(Memory memory) {
		System.out.println("Visiting Memory");

	}

}
