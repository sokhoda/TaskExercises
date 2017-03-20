package decorator.choco;

import decorator.Pie;

public class WhiteChocolate extends ChocolateDecorator {
	private Pie pie;

	public WhiteChocolate(Pie pie) {
		this.pie = pie;
	}

	@Override
	public String getDescription() {
		return pie.getDescription() + ", white chocolate";
	}

	@Override
	public int getCost() {
		return pie.getCost() + 2;
	}

	@Override
	public int cookingTime() {
		return pie.cookingTime() + 10;
	}

}
