package struct.decorator;

public abstract class Pie {
	private static final int ORDINARYCOST = 100;
	private static final int ORDINARYTIME = 97;
	String description;

	public String getDescription() {
		return description;
	}

	public abstract int calcCost();

	public abstract int calcCookingTime();

	@Override
	public String toString() {
		return getDescription() + ": cost:" + calcCost() + ", time:"
				+ calcCookingTime();
	}
}
