package taskstring1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerJUnit {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure);
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests passed.");
		}
	}
}
