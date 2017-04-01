package task4;

public class A {
	private int n;
	private final int nFinal;
	private static int fieldStatic;

	public A() {
		this.n = 2;
		nFinal = 100;
		fieldStatic = -12;
	}

	public A(int n, int fieldStatic, int nFinal) {
		this.n = n;
		this.nFinal = nFinal;
		this.fieldStatic = fieldStatic;
	}

	public void someMethod() {
		int locVar = 1; // prohibited in jdk 1.7 and earlier
		final int locFinal = 10;

		ITask4 task = new ITask4() {

			@Override
			public void showMe() {
				System.out.println("showMe!");
				System.out.println("locVar = " + locVar);
				System.out.println("locFinal = " + locFinal);
				System.out.println("A.n = " + n);
				System.out.println("A.nFinal = " + nFinal);
				System.out.println("A.fieldStatic = " + fieldStatic);
				// locVar = 1;
			}
		};
		// locVar = 112;
		task.showMe();

	}
}
