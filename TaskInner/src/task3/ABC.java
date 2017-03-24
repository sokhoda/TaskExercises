package task3;

public class ABC {
	private int n;
	private final int nFinal;
	private static int fieldStatic;

	public ABC() {
		this.n = 2;
		nFinal = 100;
		fieldStatic = -12;
	}

	public ABC(int n, int fieldStatic, int nFinal) {
		this.n = n;
		this.nFinal = nFinal;
		this.fieldStatic = fieldStatic;
	}

	public void someMethod() {
		int locVar = 1; // prohibited in jdk 1.7 and earlier
		final int locFinal = 10;

		abstract class B implements ITask3 {
			private int locIntB;
			private final static int staticInt = 12;

			public B() {
			}

			public B(int locIntB) {
				this.locIntB = locIntB;
			}

			public abstract int someAbstractMethod();

			@Override
			public void showMe() {
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

		class C extends B {

			public C(int locIntB) {
				super(locIntB);
			}

			@Override
			public int someAbstractMethod() {
				return getLocIntB();
			}

		}
		C c = new C(111);
		System.out.println("locIntB = " + c.someAbstractMethod());
		c.showMe();
		// B b = new B();
		// System.out.println("locIntB = " + b.locIntB);
		// b.showMe();

	}
}
