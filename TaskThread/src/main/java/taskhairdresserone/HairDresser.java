package taskhairdresserone;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class HairDresser {
	private static int count;
	private int id;
	private Thread hDresserThread;
	private BarbersShop bShop;
	private CopyOnWriteArrayList<ClientServiceLog> clog;
	private final Random rand = new Random();

	public HairDresser(BarbersShop bShop, Thread hDresserThread) {
		this.id = count++;
		this.bShop = bShop;
		this.hDresserThread = hDresserThread;
		clog = new CopyOnWriteArrayList<>();
	}

	public synchronized void wakeUpHDresser(final ClientRunnable clientRunnable) {
		if (!clientRunnable.isAlreadyServiced()
				&& hDresserThread.getState() == Thread.State.WAITING) {
			this.notifyAll();
			System.out.println(Thread.currentThread().getName()
					+ " wakes up Hairdresser " + id);
		}
	}

	public synchronized void sleep() {
		System.out.println("Hairdresser " + id + ": I`m going to sleep.");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized boolean isAllWaitingRoomsEmpty() {
		List<WaitingRoom> wtRooms = bShop.getWtRooms();
		int i = 0;
		while (i < wtRooms.size() && wtRooms.get(i).getQueue().isEmpty()) {
			i++;
		}
		return i == wtRooms.size() ? true : false;
	}

	public synchronized void doHairCut(Client client) {
		WorkingRoom wkRoom = bShop.getWkRoom();

		try {
			wkRoom.getQueue().put(client);
			CutType cutType = CutType.getRandCut(client.getSex());
			int cutTime = cutType.getCutTime();

			System.out.println("start cutting client " + client.getId()
					+ ", cut:" + cutType.name() + ", time:" + cutTime);
			TimeUnit.MILLISECONDS.sleep(cutTime * 100);
			System.out.println("finish cutting client " + client.getId());
			client.getClientRunnable().setAlreadyServiced(true);
			wkRoom.getQueue().take();

			clog.add(new ClientServiceLog(client.getId(), cutType,
					getActualPrice(cutType.getPrice())));

			// ----check if I can sleep
			if (isAllWaitingRoomsEmpty()) {
				sleep();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized int getActualPrice(final int price) {
		return (int) (1 + (5 - rand.nextInt(11)) / 10.) * price;
	}

	public Thread gethDresserThread() {
		return hDresserThread;
	}

	public void sethDresserThread(Thread hDresserThread) {
		this.hDresserThread = hDresserThread;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BarbersShop getbShop() {
		return bShop;
	}

	public void setbShop(BarbersShop bShop) {
		this.bShop = bShop;
	}

}
