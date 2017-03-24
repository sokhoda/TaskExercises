package task4;

public class Task4Runner {
	public static void main(String[] args) {
		A a = new A(-1, 15, 101);
		a.someMethod();

		new A() {
			@Override
			public void someMethod() {
				System.out.println("Overriden!!");
			};
		}.someMethod();
	}
}
