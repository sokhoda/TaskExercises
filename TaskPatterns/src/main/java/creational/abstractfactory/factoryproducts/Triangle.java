package creational.abstractfactory.factoryproducts;

import creational.abstractfactory.Color;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Triangle {
	private Color color;
	private double side1;
	private double side2;
	private double angle;

	private double getPerimeter() {
		double side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1
				* side2 * Math.cos(angle));
		return Math.round((side1 + side2 + side3) * 1000) / 1000.;
	}

	private double getArea() {
		double res = side1 * side2 * Math.sin(angle) / 2.;
		return Math.round(res * 1000) / 1000.;
	}

	@Override
	public String toString() {
		return "color: " + color +
				"\nArea:" + getArea() + ", Perimeter:" + getPerimeter();
	}
}
