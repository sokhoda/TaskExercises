package taskclass;

public class YieldDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("i: " + i + "<-- at"
					+ Thread.currentThread().getName());
			Thread.yield();
		}

	}

	public static void main(String[] args) {
		Thread th1 = new Thread(new YieldDemo());
		th1.setName("TH1");

		Thread th2 = new Thread(new YieldDemo());
		th2.setName("TH2");

		th1.setPriority(8);
		th2.setPriority(8);
		th1.start();
		th2.start();
		System.out.println("End");
	}

}
