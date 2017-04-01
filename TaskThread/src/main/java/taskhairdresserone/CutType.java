package taskhairdresserone;

import java.util.Random;

public enum CutType {
	MCLASSIC(20, 100, 1), WCLASSIC(25, 200, 0), MSHORT(15, 120, 1), WSHORT(20,
			220, 0), WCARE(35, 550, 0), MBOX(30, 125, 1), MSEMIBOX(40, 145, 1);

	private int cutTime;
	private int price;
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

	private CutType(int cutTime, int price, int sex) {
		this.cutTime = cutTime;
		this.price = price;
		this.sex = sex;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
