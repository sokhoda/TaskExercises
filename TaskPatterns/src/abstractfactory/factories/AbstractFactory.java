package abstractfactory.factories;

public class AbstractFactory {
	public static BaseFactory getFactory(String type) {
		if (type.equalsIgnoreCase("white")) {
			return new WhiteFactory();
		} else {
			return new BlackFactory();
		}
	}
}
