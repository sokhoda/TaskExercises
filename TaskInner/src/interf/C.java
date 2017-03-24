package interf;

import java.awt.print.PrinterAbortException;
import java.util.Arrays;
import java.util.Random;

public class C implements B {

	private Worker[] workers = new Worker[10];
	private Random rand = new Random();

	@Override
	public int someMethod(int i) throws PrinterAbortException {
		System.out.println("int");
		return 1;
		// throw new PrinterAbortException("Abort printer!!");
	}

	@Override
	public int someMethod(double d) {
		System.out.println("double");
		return 0;
	}

	// @Override
	// public int defaultMethodExample(String s) {
	// System.out.println("@Override defaultMethodExample:\n" + s);
	// return 0;
	// }

	public void someMore() {
		for (int i = 0; i < workers.length; i++) {
			workers[i] = new Worker(rand.nextInt(10000));
		}

		System.out.println(Arrays.toString(workers));
		Arrays.sort(workers);
		System.out.println(Arrays.toString(workers));
		defaultMethodExample("test default " + CONST_INT);

	}
}
