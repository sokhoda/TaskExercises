package decorator.verdure;

import decorator.Pie;

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
	public int getCost() {
		return pie.getCost() + 12;
	}

	@Override
	public int cookingTime() {
		return pie.cookingTime() + 23;
	}

}
