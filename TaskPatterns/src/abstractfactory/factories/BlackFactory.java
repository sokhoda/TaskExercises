package abstractfactory.factories;

import abstractfactory.Color;
import abstractfactory.circle.BlackCircle;
import abstractfactory.circle.Circle;
import abstractfactory.triangle.BlackTriangle;
import abstractfactory.triangle.Triangle;

public class BlackFactory extends BaseFactory {
	private static final Color color = Color.BLACK;

	@Override
	public Circle createCircle(final double radius) {
		return new BlackCircle(color, radius);
	}

	@Override
	public Triangle createTriangle(final double side1, final double side2,
			final double angle) {
		return new BlackTriangle(color, side1, side2, angle);
	}
}
