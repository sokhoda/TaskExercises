package task2;

import java.io.Serializable;

public class Airplane implements Serializable {
	private static int weight = 10;
	private static AirplaneEngine engineStatic;
	private String planeName;
	private int maxVelocity;
	private AirplaneEngine engine1;
	private AirplaneEngine engine2;

	public Airplane(String planeName, int maxVelocity) {
		engine1 = new AirplaneEngine("leftEngine");
		engine2 = new AirplaneEngine("rightEngine");
		this.maxVelocity = maxVelocity;
		this.planeName = planeName;
	}

	public Airplane() {
	}

	static {
		AirplaneEngine engine0 = new AirplaneEngine("newEngine");
	}

	public static AirplaneEngine initStaticEngine() {
		engineStatic = new AirplaneEngine("StarterEngine");
		return engineStatic;
	}

	public void setMaxVelocity(int maxVelocity) {
		this.maxVelocity = maxVelocity;
		System.out.println("MaxVelocity changed to " + maxVelocity);
		// new AirplaneEngine().setMaxVelocity(120);
	}

	public int getMaxVelocity() {
		return maxVelocity;
	}

	public void changeName(String name) {
		// engine1.setPlaneName(name);
		new AirplaneEngine().setPlaneName(name);
	}

	public void accessToNestedClassMethod() {
		System.out
		.println("----------------------accessToNestedClassMethod-----------------");
		new AirplaneEngine().getWeight();
		AirplaneEngine eng = new AirplaneEngine("TestEngine");
		System.out.println(eng.engine);
	}

	public void accessToNestedClassStaticMethod() {
		System.out
				.println("----------------------accessToNestedClassStaticMethod-----------------");
		AirplaneEngine.nestedClassStaticMethod();
		System.out.println("NESTEDCLASS_STATIC_FIELD="
				+ AirplaneEngine.NESTEDCLASS_STATIAC_FIELD);
		AirplaneEngine ee = new AirplaneEngine();
	}

	public void takeOff() {
		System.out.println("\nPlane " + planeName + " is going to take off.");
		engine1.start();
		engine2.start();
	}

	public void land() {
		System.out.println("\nPlane " + planeName + " is going to land.");
		engine1.stop();
		engine2.stop();
	}

	public static class AirplaneEngine implements IEngine, Serializable {
		static int NESTEDCLASS_STATIAC_FIELD = 12;
		private Engine engine;

		// private static int someStaticInt;
		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			Airplane.weight = weight;
		}

		public void accessToOuterClassStaticMethod() {
			System.out
			.println("----------------------accessToOuterClassStaticMethod-----------------");
			initStaticEngine();
			System.out.println(engineStatic);
		}

		public void accessToOuterClassMethod() {
			System.out
					.println("----------------------accessToOuterClassMethod-----------------");
			// System.out.println(planeName);
			Airplane plane = new Airplane("NestedClassPlane", 120);
			System.out.println(plane.planeName);
			System.out.println(plane.engine1);
			plane.land();
		}

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		class Engine implements Serializable {
			private String name;
			private int started;
			private int power;

			public Engine() {
			}

			public Engine(String name) {
				this.name = name;
			}

			public Engine(String name, int started, int power) {
				this.name = name;
				this.started = started;
				this.power = power;
			}

			public int getPower() {
				return power;
			}

			public void setPower(int power) {
				this.power = power;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getStarted() {
				return started;
			}

			public void setStarted(int started) {
				this.started = started;
			}

			@Override
			public String toString() {
				return "Engine [name=" + name + ", started=" + started
						+ ", power=" + power + "]";
			}

		}

		public AirplaneEngine() {
			engine = new Engine();
		}

		public AirplaneEngine(String name) {
			this();
			engine.name = name;
		}

		public static void nestedClassStaticMethod() {
			System.out.println("weight=" + weight);
		}

		public void setPlaneName(String name) {
			Airplane airplane = new Airplane();
			airplane.planeName = name;
		}

		@Override
		public void start() {
			engine.started = 1;
			System.out.println("Engine " + engine.name + " started.");
		}

		@Override
		public void restart() {
			System.out.println("\n" + engine.name + " restarts.");
			engine.started = 0;
			System.out.println("\nEngine " + engine.name + " stopped.");
			engine.started = 1;
			System.out.println("Engine " + engine.name + " started.");
		}

		@Override
		public void stop() {
			engine.started = 0;
			System.out.println("Engine " + engine.name + " stopped.");
		}

		@Override
		public String toString() {
			return "AirplaneEngine [name=" + engine.name + ", started="
					+ engine.started + "]";
		}
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public static AirplaneEngine getEngineStatic() {
		return engineStatic;
	}

	public static void setEngineStatic(AirplaneEngine engineStatic) {
		Airplane.engineStatic = engineStatic;
	}

	public AirplaneEngine getEngine1() {
		return engine1;
	}

	public void setEngine1(AirplaneEngine engine1) {
		this.engine1 = engine1;
	}

	public AirplaneEngine getEngine2() {
		return engine2;
	}

	public void setEngine2(AirplaneEngine engine2) {
		this.engine2 = engine2;
	}

	@Override
	public String toString() {
		return "Airplane [planeName=" + planeName + ", maxVelocity="
				+ maxVelocity + ", engine1=" + engine1 + ", engine2=" + engine2
				+ "]";
	}
}
