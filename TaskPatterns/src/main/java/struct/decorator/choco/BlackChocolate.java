package struct.decorator.choco;

import struct.decorator.Pie;

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
	public int calcCost() {
		return pie.calcCost() + 7;
	}

	@Override
	public int calcCookingTime() {
		return pie.calcCookingTime() + 5;
	}

}
