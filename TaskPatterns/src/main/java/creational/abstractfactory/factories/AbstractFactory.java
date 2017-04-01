package creational.abstractfactory.factories;

public class AbstractFactory {
	public static BaseFactory getFactory(String type) {
		return type.equalsIgnoreCase("white") ? new WhiteFactory() : new BlackFactory();
	}
}
