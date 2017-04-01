package task1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import task1.Airplane.AirplaneEngine;

import java.util.Comparator;

public class Task1Runner {
	private static final Logger log = LogManager.getLogger(Task1Runner.class
			.getName());

	public static void main(String[] args) {
		System.out.println("log.getName()" + log.getName());

		log.info("\n--------------------------------------- NEW PROGRAM RUN ---------------------------------------"
				+ "\n\\\n\\\n\\\n----------------------------------------------------------------------------------------------");
//		int f = 12;
//		log.entry(f);
//		log.exit(2 * f);
		Airplane plane = new Airplane("Boeing 777", 500);
		System.out.println(plane);
		plane.takeOff();

		plane.setMaxVelocity(400);

		plane.setPlaneName("AN-130");
		System.out.println(plane);

		plane.land();
		plane.getEngine1().restart();

		System.out
		.println("\n----------------------inner class static field ------------------------------ ");
		System.out.println("AirplaneEngine.INNERCLASS_STATIC_FINAL_FIELD ="
				+ AirplaneEngine.INNERCLASS_STATIC_FINAL_FIELD);

		System.out.println("\n plane = " + plane.getPlaneName() + " "
				+ Airplane.getEngineStatic());
		plane.accessToInnerClassMethod();
		plane.accessToInnerClassStatic();

		plane.getEngine2().accessToOuterClassMethod();
		plane.getEngine2().accessToOuterClassStaticMethod();
		System.out.println("\n plane = " + plane.getPlaneName() + " "
				+ Airplane.getEngineStatic());
		AirplaneEngine eng = new Airplane().new AirplaneEngine();

		System.gc();
		Runtime.getRuntime().gc();
		new Comparator<Airplane>() {
			@Override
			public int compare(Airplane o1, Airplane o2) {
				return 0;
			}
		};
		Comparator<Airplane> c = (Airplane o1, Airplane o2) -> o1.getMaxVelocity() - o2.getMaxVelocity();
	}
}
