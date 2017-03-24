package task1;

import java.io.Serializable;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Airplane implements Serializable {
	private static final Logger log = LogManager
			.getLogger(Airplane.class.getName());
	private static int weight;
	private static final int DEFAULT_ENGINE_POWER = 135;
	private static AirplaneEngine engineStatic;
	private String planeName;
	private int maxVelocity;
	private AirplaneEngine engine1;
	private AirplaneEngine engine2;

	{
		System.out.println(log.getLevel());
	}

	public Airplane(String planeName, int maxVelocity) {
		engine1 = new AirplaneEngine("leftEngine", DEFAULT_ENGINE_POWER);
		engine2 = new AirplaneEngine("rightEngine", DEFAULT_ENGINE_POWER);
		this.maxVelocity = maxVelocity;
		this.planeName = planeName;
	}

	public Airplane() {

	}

	public void accessToInnerClassStatic() {
		System.out.println(
				"----------------------accessToInnerClassStatic-----------------");
		System.out.println("AirplaneEngine.INNERCLASS_STATIC_FINAL_FIELD ="
				+ AirplaneEngine.INNERCLASS_STATIC_FINAL_FIELD);
	}

	public void accessToInnerClassMethod() {
		System.out.println(
				"----------------------accessToInnerClassMethod-----------------");
		System.out.println("weight = " + engine1.getWeight());
		engine1.engine.setStarted(1);
		engine1.engine.setPower(133);
		System.out.println("engine1=" + engine1.engine);
	}

	// static {
	// AirplaneEngine engine0 = new AirplaneEngine("newEngine");
	// }

	public static AirplaneEngine initStaticEngine() {
		engineStatic = new Airplane().new AirplaneEngine("StarterEngine", 100);
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

	public void takeOff() {
		log.info("Plane " + planeName + " is going to take off.");
		System.out.println("\nPlane " + planeName + " is going to take off.");
		engine1.start();
		engine2.start();
		log.info("Plane " + planeName + " has taken off.");
	}

	public void land() {
		log.info("Plane " + planeName + " is going to land.");
		System.out.println("\nPlane " + planeName + " is going to land.");
		engine1.stop();
		engine2.stop();
		log.info("Plane " + planeName + " landed.");
	}

	public class AirplaneEngine implements IEngine {
		static final int INNERCLASS_STATIC_FINAL_FIELD = 12;
		private Engine engine;

		// private static int someStaticInt;

		public AirplaneEngine() {
			engine = new Engine();
		}

		public AirplaneEngine(String name, int power) {
			this();
			engine.name = name;
			engine.power = power;
		}

		public int getWeight() {
			return weight;
		}

		public void accessToOuterClassMethod() {
			System.out.println(
					"----------------------accessToOuterClassMethod-----------------");
			System.out.println(planeName);
			System.out
					.println("engine2.engine.power = " + engine2.engine.power);
			takeOff();
		}

		public void accessToOuterClassStaticMethod() {
			System.out.println(
					"----------------------accessToOuterClassStaticMethod-----------------");
			initStaticEngine();
			System.out.println(engineStatic);
		}

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		class Engine {
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

		// public static void staticMethod() {
		// System.out.println(weight);
		// }

		@Override
		public void start() {
			String messageStart = "Engine " + engine.name
					+ " is going to start.";
			log.info(messageStart);
			engine.started = 1;
			System.out.println(messageStart);
			log.warn("Engine " + engine.name + " started.");
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

	public void innerInstance() {
		AirplaneEngine airPlaneEngine = new AirplaneEngine();
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
