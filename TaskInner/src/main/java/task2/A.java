package task2;

public class A {
	private B fieldB;
	private int n;
	private static B fieldBstatic;

	public B getRef() {
		return new B(10);
	}

	public A() {
		this.n = 2;
		fieldBstatic = new B(-12);
		fieldB = new B(12);
	}

	public A(int n, B fieldB, B fieldBstatic) {
		this.n = n;
		this.fieldB = fieldB;
		A.fieldBstatic = fieldBstatic;
	}

	public static void someMethod() {
		B b = new B(100);
		b.showMe();

		System.out.println(b.k);
		System.out.println(B.intValue);

	}

	public int someMethodA() {
		A a = new A();
		System.out.println("a.n = " + a.n);
		System.out.println("fieldBstatic.getK()=" + fieldBstatic.getK());
		System.out.println("a.fieldB.getK()=" + a.fieldB.getK());
		A aa = new A(17, new B(22), new B(-22));
		System.out.println("new A(17, new B(22), new B(-22)).n=" + aa.n);
		System.out.println("fieldBstatic.getK()=" + fieldBstatic.getK());
		System.out.println("aa.fieldB.getK()=" + aa.fieldB.getK());
		System.out.println("new A().n = " + new A().n);
		System.out.println("fieldBstatic.getK()=" + fieldBstatic.getK());
		System.out.println("this.fieldB.k=" + this.fieldB.k);
		return this.fieldB.k;
	}

	static class B implements ITask2 {
		private int k;
		private static int intValue;

		public B() {
		}

		public B(int k) {
			this.k = k;
		}

		public int getK() {
			return k;
		}

		@Override
		public void showMe() {
			System.out.println("showMe!");
			System.out.println("new A().fieldB.k=" + new A().fieldB.k);
			System.out.println("fieldBstatic.getK()=" + fieldBstatic.getK());
		}
	}
}
