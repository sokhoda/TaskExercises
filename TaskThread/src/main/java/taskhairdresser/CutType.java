package taskhairdresser;

import java.util.Random;

public enum CutType {
	MCLASSIC(20, 1), WCLASSIC(25, 0), MSHORT(15, 1), WSHORT(20, 0), WCARE(35, 0), MBOX(
			30, 1), MSEMIBOX(40, 1);

	private int cutTime;
	private int sex;
	private static final int SIZE = CutType.values().length;
	private static final Random rand = new Random();

	public static CutType getRandCut(final int sex) {
		CutType res = null;
		while (res == null || res.getSex() != sex) {
			res = CutType.values()[rand.nextInt(SIZE)];
		}
		return res;
	}

	private CutType(int cutTime, int sex) {
		this.cutTime = cutTime;
		this.sex = sex;
	}

	public int getCutTime() {
		return cutTime;
	}

	public void setCutTime(int cutTime) {
		this.cutTime = cutTime;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
