package singleton;

public class Runner {
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance(12);
		Singleton1 s11 = Singleton1.getInstance(144);
		System.out.println(s1);
		System.out.println(s11);

		Singleton2 s2 = Singleton2.getInstance();
		Singleton2 s22 = Singleton2.getInstance();
		System.out.println(s2);
		System.out.println(s22);

	}
}
