package atomics;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo implements Callable<AtomicInteger> {
	private static AtomicInteger counter;
	private static CyclicBarrier bar = new CyclicBarrier(2);

	public AtomicDemo() {
	}

	public static void main(String[] args) throws InterruptedException,
			ExecutionException, BrokenBarrierException {

		AtomicDemo at1 = new AtomicDemo();
		AtomicDemo at2 = new AtomicDemo();
		AtomicDemo.counter = new AtomicInteger(0);
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<AtomicInteger> res1 = ex.submit(new AtomicDemo());
		Future<AtomicInteger> res2 = ex.submit(new AtomicDemo());
		System.out.println("			res1:" + res1.get());
		System.out.println("			res2:" + res2.get());
		// System.out.println("counter" + at1.getCounter().get());
	}

	@Override
	public AtomicInteger call()
			throws InterruptedException, BrokenBarrierException {
		for (int i = 0; i < 2000; i++) {
			System.out.println("i:" + i + " " + counter.getAndIncrement()
					+ "<--" + Thread.currentThread().getName());
		}
		bar.await();
		System.out.println(bar.getNumberWaiting());
		return counter;
	}

	public AtomicInteger getCounter() {
		return counter;
	}

	public void setCounter(AtomicInteger counter) {
		AtomicDemo.counter = counter;
	}

}
