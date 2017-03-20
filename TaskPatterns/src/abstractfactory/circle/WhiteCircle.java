package abstractfactory.circle;

import abstractfactory.Color;

public class WhiteCircle extends Circle {
	private Color color;

	public WhiteCircle(Color color, double radius) {
		super(radius);
		this.color = color;
	}

	@Override
	public Color getColor() {
		return color;
	}

}
