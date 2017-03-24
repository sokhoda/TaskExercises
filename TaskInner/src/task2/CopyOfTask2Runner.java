package task2;

import task2.A.B;

public class CopyOfTask2Runner {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getRef().getK());
		a.someMethodA();
		System.out.println();

		A.someMethod();
		B b = new B();
		b.showMe();

		B bb = new B();
		// A.B nested = new A.B();
	}
}
