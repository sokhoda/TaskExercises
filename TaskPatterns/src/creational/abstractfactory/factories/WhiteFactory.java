package creational.abstractfactory.factories;

import creational.abstractfactory.Color;
import creational.abstractfactory.factoryproducts.Circle;
import creational.abstractfactory.factoryproducts.Triangle;

public class WhiteFactory extends BaseFactory {
	private static final Color color = Color.WHITE;

	@Override
	public Circle createCircle(final double radius) {
		return new Circle(color, radius);
	}

	@Override
	public Triangle createTriangle(final double side1, final double side2,
			final double angle) {
		return new Triangle(color, side1, side2, angle);
	}

}
