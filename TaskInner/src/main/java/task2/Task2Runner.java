package task2;

import task2.Airplane.AirplaneEngine;

public class Task2Runner {
	public static void main(String[] args) {
		Airplane plane = new Airplane("Boeing 777", 500);
		System.out.println(plane);
		plane.takeOff();

		System.out.println("\nnested class static field: "
				+ AirplaneEngine.NESTEDCLASS_STATIAC_FIELD);

		plane.setMaxVelocity(400);
		plane.setPlaneName("AN-130");
		System.out.println(plane);

		plane.land();
		plane.getEngine1().restart();

		System.out
		.println("----------------Access to nested class outside base class--------------");
		System.out.println(new AirplaneEngine("MyEngine"));

		plane.accessToNestedClassMethod();
		plane.accessToNestedClassStaticMethod();

		System.out.println("\n plane = " + plane.getPlaneName() + " "
				+ Airplane.getEngineStatic());

		new AirplaneEngine().accessToOuterClassStaticMethod();
		plane.getEngine2().accessToOuterClassMethod();

		System.out.println("\n plane = " + plane.getPlaneName() + " "
				+ Airplane.getEngineStatic());

	}
}
