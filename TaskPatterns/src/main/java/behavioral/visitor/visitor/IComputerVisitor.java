package behavioral.visitor.visitor;

import behavioral.visitor.element.CPU;
import behavioral.visitor.element.Computer;
import behavioral.visitor.element.Hdd;
import behavioral.visitor.element.Memory;

public interface IComputerVisitor {
	void visit(CPU cpu);

	void visit(Computer computer);

	void visit(Hdd hdd);

	void visit(Memory memory);
}
