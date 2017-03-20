package proxy;

public class ProxyRunner {
	public static void main(String[] args) {

		System.out.println("proxy1");
		ProxyFolder proxy = new ProxyFolder(new User("qW", "1"));
		proxy.doSomeJob();

		System.out.println("proxy2");
		ProxyFolder proxy2 = new ProxyFolder(new User("qW", "11"));
		proxy2.doSomeJob();

	}
}
