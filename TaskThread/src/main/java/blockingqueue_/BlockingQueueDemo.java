package blockingqueue_;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {

	private static final int SIZE = 10;
	private static BlockingQueue<Integer> q = new ArrayBlockingQueue<>(SIZE);

	public static void main(String[] args) throws InterruptedException {

		TimeUnit.SECONDS.sleep(1);
		System.out.println(TimeUnit.valueOf("SECONDS").ordinal());
		for (int i = 0; i < SIZE; i++) {
			((ArrayBlockingQueue<Integer>) q).put(i);
		}
		ConcurrentLinkedQueue<Integer> q1;
		for (int i = 0; i < SIZE - 2; i++) {
			System.out.println(q.take());
			System.out.println(q + " " + Thread.currentThread().getState());
		}
		System.out.println(TimeUnit.DAYS.toMicros(1));
		System.out.println(TimeUnit.DAYS.convert(578, TimeUnit.HOURS));

	}
}
