package behavioral.state;

import java.util.Random;

public enum ExecResult {
	SUCCESS, FAIL;

	static final Random rand = new Random();

	public static ExecResult getRandRes() {
		return rand.nextBoolean() ? SUCCESS :  FAIL;
	}

}
