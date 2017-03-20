package flyweight;

public class FlyweightRunner {
	private static final int tableNum = 20;
	public static Coffee[] coffees = new Coffee[tableNum];
	public static CoffeeContext[] tables = new CoffeeContext[tableNum];
	private static int orderNum;
	private static CoffeeFactory factory = new CoffeeFactory();

	public static void takeOrder(String flavor, int tableId) {
		coffees[orderNum] = factory.getCoffee(flavor);
		tables[orderNum++] = factory.getCoffeeContext(tableId);
	}

	public static void main(String[] args) {
		takeOrder("Americana", 1);
		takeOrder("Esspresso", 2);
		takeOrder("Esspresso", 2);
		takeOrder("Lattee", 10);
		takeOrder("Lattee", 7);
		takeOrder("Lattee", 1);
		takeOrder("Lattee", 5);
		takeOrder("Lattee", 8);
		takeOrder("Americana", 14);

		for (int i = 0; i < orderNum; i++) {
			coffees[i].serveCoffee(tables[i]);
		}
		System.out.println("Num of Orders:" + orderNum);
		System.out.println("Num of Coffees:" + factory.getCoffeeMapSize());
		System.out.println("Num of Tables:" + factory.getContextMapSize());
	}
}
