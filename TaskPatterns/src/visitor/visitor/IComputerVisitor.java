package visitor.visitor;

import visitor.element.CPU;
import visitor.element.Computer;
import visitor.element.Hdd;
import visitor.element.Memory;

public interface IComputerVisitor {
	void visit(CPU cpu);

	void visit(Computer computer);

	void visit(Hdd hdd);

	void visit(Memory memory);
}
