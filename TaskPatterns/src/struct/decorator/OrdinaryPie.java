package struct.decorator;


public class OrdinaryPie extends Pie {

	@Override
	public String getDescription() {
		return "Ordinary Pie";
	}

	@Override
	public int calcCost() {
		return 100;
	}

	@Override
	public int calcCookingTime() {
		return 100;
	}
}
