package builder;

public class BuilderRunner {
	public static void main(String[] args) {
		System.out.println("Printing technical book");
		BookWriter writer = new BookWriter(new TechnicalBookBuilder());
		writer.writeBook();
	}
}
