package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	public static void main(String[] args) {
		Semaphore phore = new Semaphore(1);

		try {
			phore.acquire();
			{
				System.out.println(
						"availablePermits:" + phore.availablePermits());
				phore.release();
			}
			phore.acquire();
			{
				System.out.println(
						"availablePermits:" + phore.availablePermits());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			phore.release();
		}
	}
}
