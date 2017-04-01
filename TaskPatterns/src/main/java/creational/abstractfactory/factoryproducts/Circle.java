package creational.abstractfactory.factoryproducts;

import creational.abstractfactory.Color;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle {
	private Color color;
	private double radius;

	@Override
	public String toString() {
		return "color: "+ color +
				"\nArea:" + getArea() + ", Length:" + getLength();
	}

	private double getLength() {
		return Math.round((2 * Math.PI * radius) * 1000) / 1000.;
	}

	private double getArea() {
		return Math.round((Math.PI * radius * radius) * 1000) / 1000.;
	}
}
