package facade;

public class Computer implements Computerable {
	private CPU cpu;
	private Memory memory;

	private Hdd hdd;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		hdd = new Hdd();
	}

	@Override
	public void operate() {
		cpu.run();
		memory.run();
		hdd.operate();

	}
}