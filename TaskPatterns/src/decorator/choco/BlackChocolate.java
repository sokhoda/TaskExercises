package decorator.choco;

import decorator.Pie;

public class BlackChocolate extends ChocolateDecorator {
	private Pie pie;

	public BlackChocolate(Pie pie) {
		this.pie = pie;
	}

	@Override
	public String getDescription() {
		return pie.getDescription() + ", black chocolate";
	}

	@Override
	public int getCost() {
		return pie.getCost() + 7;
	}

	@Override
	public int cookingTime() {
		return pie.cookingTime() + 5;
	}

}
