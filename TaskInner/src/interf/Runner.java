package interf;

import java.awt.print.PrinterAbortException;

import privateclass.PrivateClass;

public class Runner {
	public static void main(String[] args) {
		C obj = new C();
		obj.someMethod(0.34);
		System.out.println(obj instanceof B);

		D d = new D();
		System.out.println(d instanceof A);
		System.out.println(d instanceof B);

		try {
			obj.someMethod(3);
		} catch (PrinterAbortException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		obj.someMore();
		System.out.println(PrivateClass.i);
	}
}
