package creational.factorymethod;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		Vehicle myVehicle;
		if((myVehicle = FactoryMethod.getInstance(Model.BMW)) != null) {
			myVehicle.move();
		}
		FactoryMethod.getInstance(Model.MERCEDES).move();
		Model model;
		System.out.println(model = Model.valueOf("OPEL"));
		System.out.println(Arrays.toString(Model.values()));
		System.out.println(Model.MERCEDES.ordinal());
	}
}
