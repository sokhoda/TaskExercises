package creational.abstractfactory.factories;

import creational.abstractfactory.factoryproducts.Circle;
import creational.abstractfactory.factoryproducts.Triangle;

public abstract class BaseFactory {
	public abstract Circle createCircle(final double radius);

	public abstract Triangle createTriangle(final double side1,
			final double side2, final double angle);

	public String welcome() {
		return "welcome";
	}
}
