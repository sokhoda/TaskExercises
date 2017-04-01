package creational.builder;

public class BuilderRunner {
	public static void main(String[] args) {
		System.out.println("Printing technical book");
		new BookWriter(new TechnicalBookBuilder()).writeBook();
	}
}
