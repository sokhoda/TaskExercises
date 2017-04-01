package creational.abstractfactory;

import creational.abstractfactory.factoryproducts.Circle;
import creational.abstractfactory.factories.AbstractFactory;
import creational.abstractfactory.factories.BaseFactory;
import creational.abstractfactory.factoryproducts.Triangle;

public class AbstractFactoryRunner {
	public static void main(String[] args) {
		BaseFactory whiteFactory = AbstractFactory.getFactory("white");
		BaseFactory blackFactory = AbstractFactory.getFactory("black");

		System.out.println(whiteFactory.welcome());

		Circle c1 = whiteFactory.createCircle(10);
		System.out.println("\nc1: " + c1);

		Triangle t1 = blackFactory.createTriangle(3, 4, Math.PI / 2.);
		System.out.println("\nt1: " + t1);

		Triangle t2 = whiteFactory.createTriangle(10, 20, 1);
		System.out.println("\nt2: " + t2);
	}
}
