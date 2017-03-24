package interf;

import java.awt.print.PrinterAbortException;

public interface B extends A {
	int CONST_INT = 1111;

	@Override
	int someMethod(int i) throws PrinterAbortException;

	// String someMethod(int i);

	int someMethod(double d);

	default int defaultMethodExample(String s) {
		System.out.println("defaultMethodExample:\n" + s);
		return 1;
	}
}
