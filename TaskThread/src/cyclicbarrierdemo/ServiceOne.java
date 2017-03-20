package cyclicbarrierdemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ServiceOne implements Runnable {

	private final CyclicBarrier cyclicBarrier;

	public ServiceOne(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		System.out.println("Starting service One...");
		try {
			Thread.sleep(3100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out
		.println("Service One has finished its work... waiting for others...");
		System.out.println("avail:" + cyclicBarrier.getNumberWaiting());
		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			System.out.println("Service one interrupted!");
			e.printStackTrace();
		}
		System.out.println("The wait is over, lets complete Service One!");

	}

}
