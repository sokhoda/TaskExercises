package taskhairdresserone;

public class ManagerRunnable implements Runnable {

	private BarbersShop bShop;

	public ManagerRunnable(BarbersShop bShop) {
		this.bShop = bShop;
	}

	@Override
	public void run() {
		while (true) {
			bShop.setOperationTime(!bShop.isOperationTime());

			try {
				Thread.sleep(BarbersShop.OPERATIONAL_DAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
