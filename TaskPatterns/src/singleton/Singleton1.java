package singleton;

public class Singleton1 {
	private int intValue;
	private static Singleton1 instance;

	private Singleton1(int intValue) {
		this.intValue = intValue;
	}

	public static Singleton1 getInstance(int intValue) {
		if (instance == null) {
			instance = new Singleton1(intValue);
		}
		return instance;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	@Override
	public String toString() {
		return "Singleton1 [intValue=" + intValue + "]";
	}

}
