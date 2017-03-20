package abstractfactory.triangle;

import abstractfactory.Color;

public class BlackTriangle extends Triangle {
	private Color color;

	public BlackTriangle(Color color) {
		super();
		this.color = color;
	}

	public BlackTriangle(Color color, double side1, double side2, double angle) {
		super(side1, side2, angle);
		this.color = color;
	}

	@Override
	public Color getColor() {
		return color;
	}

}
