package task3;

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
		final int[] arr = new int[1];

		class B implements ITask3 {
			private int locIntB;
			private final int staticInt = 12;
			private static final int aStatic = 221;

			public B() {
			}

			public B(int locIntB) {
				this.locIntB = locIntB;
			}

			public int count() {
				return arr[0]++;
			}

			@Override
			public void showMe() {
				// locVar = 33;
				System.out.println("showMe!");
				System.out.println("locVar = " + locVar);
				System.out.println("locFinal = " + locFinal);
				System.out.println("A.n = " + n);
				System.out.println("A.nFinal = " + nFinal);
				System.out.println("A.fieldStatic = " + fieldStatic);
			}

			public int getLocIntB() {
				return locIntB;
			}

			public void setLocIntB(int locIntB) {
				this.locIntB = locIntB;
			}
		}

		B b = new B();
		System.out.println("locIntB = " + b.locIntB);
		b.showMe();
		n = 99;
		fieldStatic = 11;
		b.showMe();
		System.out.println("counter = " + b.count());
		System.out.println("counter = " + b.count());
		System.out.println("counter = " + b.count());
		System.out.println(B.aStatic);
		// locVar = 99;
		// b.showMe();

	}
}
