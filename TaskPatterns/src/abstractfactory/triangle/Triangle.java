package abstractfactory.triangle;

import abstractfactory.Color;

public abstract class Triangle {
	private double side1;
	private double side2;
	private double angle;

	public Triangle() {
		this.side1 = 3;
		this.side2 = 4;
		this.angle = Math.PI * .5;
	}

	public Triangle(double side1, double side2, double angle) {
		this.side1 = side1;
		this.side2 = side2;
		this.angle = angle;
	}

	public abstract Color getColor();

	public double getPerimeter() {
		double side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1
				* side2 * Math.cos(angle));
		return Math.round((side1 + side2 + side3) * 1000) / 1000.;
	}

	public double getArea() {
		double res = side1 * side2 * Math.sin(angle) / 2.;
		return Math.round(res * 1000) / 1000.;
	}

	@Override
	public String toString() {
		return "Area:" + getArea() + ", Perimeter:" + getPerimeter();
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

}
