package struct.decorator.verdure;

import struct.decorator.Pie;

public class Camomile extends VerdureDecorator {
	private Pie pie;

	public Camomile(Pie pie, String collectionYear) {
		this.pie = pie;
		super.collectionYear = collectionYear;

	}

	@Override
	public String getDescription() {
		return pie.getDescription() + ", camomile, colYear:" + collectionYear
				+ ", cut type:" + cutting;
	}

	@Override
	public void cut(int type) {
		cutting = type;
		System.out.println("cut type camomile:" + type);

	}

	@Override
	public int calcCost() {
		return pie.calcCost() + 12;
	}

	@Override
	public int calcCookingTime() {
		return pie.calcCookingTime() + 23;
	}

}
