package taskclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Th {

	private static void fillList(List<Integer> list, int k) {
		for (int i = 0; i < k; i++) {
			list.add(i);
		}
	}

	public static void main(String[] args)
			throws InterruptedException, ExecutionException {
		List<Integer> list1 = Collections
				.synchronizedList(new ArrayList<Integer>());
		List<Integer> list2 = new CopyOnWriteArrayList<>();
		fillList(list1, 100);
		fillList(list2, 100);
		System.out.println("List synchronized:");
		checkList(list1);
		System.out.println("CopyOnWriteArrayList:");
		checkList(list2);

	}

	private static void checkList(List<Integer> list)
			throws InterruptedException, ExecutionException {
		CountDownLatch latch = new CountDownLatch(1);
		ExecutorService ex = Executors.newFixedThreadPool(2);
		// latch.

		Future<Long> f1 = ex.submit(new GetThread(0, 50, list, latch));
		Future<Long> f2 = ex.submit(new GetThread(50, 100, list, latch));
		latch.countDown();
		System.out.println("Thread 1: " + f1.get() / 1000);
		System.out.println("Thread 2: " + f2.get() / 1000);
	}

	static class GetThread implements Callable<Long> {
		private int start;
		private int end;
		private List list;
		private CountDownLatch latch;

		public GetThread(int start, int end, List list, CountDownLatch latch) {
			this.start = start;
			this.end = end;
			this.list = list;
			this.latch = latch;
		}

		@Override
		public Long call() throws InterruptedException {
			latch.await();
			long startTime = System.nanoTime();
			for (int i = start; i < end; i++) {
				list.get(i);
			}

			return System.nanoTime() - startTime;
		}
	}

}
