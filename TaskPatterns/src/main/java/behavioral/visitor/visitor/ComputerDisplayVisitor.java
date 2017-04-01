package behavioral.visitor.visitor;

import behavioral.visitor.element.CPU;
import behavioral.visitor.element.Computer;
import behavioral.visitor.element.Hdd;
import behavioral.visitor.element.Memory;

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
