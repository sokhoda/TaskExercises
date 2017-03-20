package state;

import java.util.Random;

public enum ExecResult {
	SUCCESS, FAIL;

	static final Random rand = new Random();

	public static ExecResult getRandRes() {
		ExecResult res = null;
		if (rand.nextInt(100) > 50) {
			res = SUCCESS;
		} else {
			res = FAIL;
		}
		return res;
	}

}
