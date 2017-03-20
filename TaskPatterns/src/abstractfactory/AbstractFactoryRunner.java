package abstractfactory;

import abstractfactory.circle.Circle;
import abstractfactory.factories.AbstractFactory;
import abstractfactory.factories.BaseFactory;
import abstractfactory.triangle.Triangle;

public class AbstractFactoryRunner {
	public static void main(String[] args) {
		BaseFactory whiteFactory = AbstractFactory.getFactory("white");
		BaseFactory blackFactory = AbstractFactory.getFactory("black");

		System.out.println(whiteFactory.welcome());

		Circle c1 = whiteFactory.createCircle(10);
		System.out.println("c1: color: " + c1.getColor() + "\n" + c1);

		Triangle t1 = blackFactory.createTriangle(3, 4, Math.PI / 2.);
		System.out.println("t1: color: " + t1.getColor() + "\n" + t1);

		Triangle t2 = whiteFactory.createTriangle(10, 20, 1);
		System.out.println("t2: color: " + t2.getColor() + "\n" + t2);
	}
}
