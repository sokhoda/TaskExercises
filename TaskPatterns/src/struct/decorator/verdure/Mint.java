package struct.decorator.verdure;

import struct.decorator.Pie;

public class Mint extends VerdureDecorator {
	private Pie pie;

	public Mint(Pie pie, String collectionYear) {
		this.pie = pie;
		super.collectionYear = collectionYear;

	}

	@Override
	public String getDescription() {
		return pie.getDescription() + ", mint, colYear:" + collectionYear
				+ ", cut type:" + cutting;
	}

	@Override
	public void cut(int type) {
		cutting = type;
		System.out.println("cut type exclusive:" + type);

	}

	@Override
	public int calcCost() {
		return pie.calcCost() + 42;
	}

	@Override
	public int calcCookingTime() {
		return pie.calcCookingTime() + 13;
	}

}
