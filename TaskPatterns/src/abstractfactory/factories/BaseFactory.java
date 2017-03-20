package abstractfactory.factories;

import abstractfactory.circle.Circle;
import abstractfactory.triangle.Triangle;

public abstract class BaseFactory {
	public abstract Circle createCircle(final double radius);

	public abstract Triangle createTriangle(final double side1,
			final double side2, final double angle);

	public String welcome() {
		return "welcome";
	}
}
