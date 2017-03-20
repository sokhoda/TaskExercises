package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
	private Map<String, Coffee> coffeeMap = new HashMap<>();
	private Map<Integer, CoffeeContext> contextMap = new HashMap<>();

	public CoffeeContext getCoffeeContext(int tableId) {
		CoffeeContext context = contextMap.get(tableId);
		if (context == null) {
			context = new CoffeeContext(tableId);
			contextMap.put(tableId, context);
		}
		return context;
	}

	public Coffee getCoffee(String flavorName) {
		Coffee coffee = coffeeMap.get(flavorName);
		if (coffee == null) {
			coffee = new Coffee(flavorName);
			coffeeMap.put(flavorName, coffee);
		}
		return coffee;
	}

	public int getCoffeeMapSize() {
		return coffeeMap.size();
	}

	public int getContextMapSize() {
		return contextMap.size();
	}

}
