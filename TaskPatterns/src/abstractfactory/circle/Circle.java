package abstractfactory.circle;

import abstractfactory.Color;

public abstract class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public abstract Color getColor();

	@Override
	public String toString() {
		return "Area:" + getArea() + ", Length:" + getLength();
	}

	public double getLength() {
		return Math.round((2 * Math.PI * radius) * 1000) / 1000.;
	}

	public double getArea() {
		return Math.round((Math.PI * radius * radius) * 1000) / 1000.;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
