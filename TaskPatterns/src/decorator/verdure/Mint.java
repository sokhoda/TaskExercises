package decorator.verdure;

import decorator.Pie;

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
	public int getCost() {
		return pie.getCost() + 42;
	}

	@Override
	public int cookingTime() {
		return pie.cookingTime() + 13;
	}

}
