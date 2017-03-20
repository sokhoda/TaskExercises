package taskhairdresserone;

public class ClientLoaderRunnable implements Runnable {

	private BarbersShop bShop;

	public ClientLoaderRunnable(BarbersShop bShop) {
		this.bShop = bShop;
	}

	@Override
	public void run() {
		boolean latch = !bShop.isOperationTime();
		while (true) {
			if (bShop.isOperationTime()) {
				if (!latch) {
					System.out
					.println("NOW BARBERS SHOP STARTS GETTING CLIENTS. THE DOOR IS OPEN.");
					latch = true;
				}
				bShop.loadWaitingRooms();
			} else {
				if (latch) {
					System.out
					.println("NOW BARBERS SHOP STOPS GETTING CLIENTS. THE DOOR IS CLOSED.");
					latch = false;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
