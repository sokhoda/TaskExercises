package decorator;

import decorator.choco.BlackChocolate;
import decorator.choco.WhiteChocolate;
import decorator.verdure.Camomile;
import decorator.verdure.Mint;
import decorator.verdure.VerdureDecorator;

public class DecoratorRunner {
	public static void main(String[] args) {
		OrdinaryPie pie = new OrdinaryPie();
		System.out.println(pie);
		Pie freshPie;
		freshPie = new Camomile(pie, "2016");
		((VerdureDecorator) freshPie).cut(12);

		freshPie = new BlackChocolate(freshPie);

		freshPie = new Mint(freshPie, "2015");
		((VerdureDecorator) freshPie).cut(20);
		freshPie = new WhiteChocolate(freshPie);

		System.out.println(freshPie);
	}
}
