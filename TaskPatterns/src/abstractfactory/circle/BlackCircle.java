package abstractfactory.circle;

import abstractfactory.Color;

public class BlackCircle extends Circle {
	private Color color;

	public BlackCircle(Color color, double radius) {
		super(radius);
		this.color = color;
	}

	@Override
	public Color getColor() {
		return color;
	}

}
