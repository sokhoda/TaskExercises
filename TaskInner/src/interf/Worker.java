package interf;

public class Worker implements Comparable<Worker> {

	private int salary;

	public Worker() {
	}

	public Worker(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [salary=" + salary + "]";
	}

	@Override
	public int compareTo(Worker o) {
		return this.getSalary() - o.getSalary();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
