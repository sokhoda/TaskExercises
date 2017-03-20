package flyweight;

public class Coffee implements ICoffee {
	private String flavor;

	public Coffee(String flavor) {
		this.flavor = flavor;
		System.out.println("Coffee is created! - " + flavor);
	}

	@Override
	public void serveCoffee(CoffeeContext context) {
		System.out.println("Coffee " + flavor + " serverd to table #"
				+ context.getTableId());

	}

}
