package decorator;


public class OrdinaryPie extends Pie {

	@Override
	public String getDescription() {
		description = "Ordinary Pie";
		return description;
	}

	@Override
	public int getCost() {
		return 100;
	}

	@Override
	public int cookingTime() {
		return 100;
	}
}
