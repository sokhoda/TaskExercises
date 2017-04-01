package struct.decorator.choco;

import struct.decorator.Pie;

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
	public int calcCost() {
		return pie.calcCost() + 2;
	}

	@Override
	public int calcCookingTime() {
		return pie.calcCookingTime() + 10;
	}

}
