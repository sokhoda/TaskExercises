package taskhairdresserone;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class HDresserRunnable implements Runnable {
	private BarbersShop bShop;

	public HDresserRunnable(BarbersShop bShop) {
		this.bShop = bShop;
	}

	@Override
	public void run() {
		List<WaitingRoom> wtRooms = bShop.getWtRooms();
		HairDresser hDresser = bShop.gethDresser();
		ArrayBlockingQueue<Client> queue;

		while (true) {
			Client client = null;
			for (WaitingRoom wtRoom : wtRooms) {
				queue = wtRoom.getQueue();
				if (!queue.isEmpty()) {
					try {
						client = queue.take();
						hDresser.doHairCut(client);
						break;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}
}
