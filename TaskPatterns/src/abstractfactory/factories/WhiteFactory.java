package abstractfactory.factories;

import abstractfactory.Color;
import abstractfactory.circle.Circle;
import abstractfactory.circle.WhiteCircle;
import abstractfactory.triangle.Triangle;
import abstractfactory.triangle.WhiteTriangle;

public class WhiteFactory extends BaseFactory {
	private static final Color color = Color.WHITE;

	@Override
	public Circle createCircle(final double radius) {
		return new WhiteCircle(color, radius);
	}

	@Override
	public Triangle createTriangle(final double side1, final double side2,
			final double angle) {
		return new WhiteTriangle(color, side1, side2, angle);
	}

}
