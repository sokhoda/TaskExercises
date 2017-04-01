package struct.decorator;

import struct.decorator.choco.BlackChocolate;
import struct.decorator.choco.WhiteChocolate;
import struct.decorator.verdure.Camomile;
import struct.decorator.verdure.Mint;
import struct.decorator.verdure.VerdureDecorator;

public class DecoratorRunner {
	public static void main(String[] args) {
		Pie pie = new OrdinaryPie();
		System.out.println(pie);

		pie = new Camomile(pie, "2016");
		((VerdureDecorator) pie).cut(12);

		pie = new BlackChocolate(pie);

		pie = new Mint(pie, "2015");
		((VerdureDecorator) pie).cut(20);
		pie = new WhiteChocolate(pie);

		System.out.println(pie);
	}
}
