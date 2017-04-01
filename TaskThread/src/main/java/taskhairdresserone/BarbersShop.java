package taskhairdresserone;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class BarbersShop {
	public static final int OPERATIONAL_DAY = 24000;
	private static final int MIN_WAIT = 1000;

	private final int id;
	private static int count;
	private HairDresser hDresser;
	private List<WaitingRoom> wtRooms;
	private WorkingRoom wkRoom;
	private boolean operationTime;
	private final Random rand = new Random();

	public BarbersShop(int[] wtRooms) {
		this.id = count++;

		this.wtRooms = Collections.synchronizedList(WaitingRoom
				.produceWaitingRoom(wtRooms));
		this.wkRoom = new WorkingRoom(1);
		operationTime = false;

		Thread hDresserThread = new Thread(new HDresserRunnable(this));
		this.hDresser = new HairDresser(this, hDresserThread);

		Thread cientLoaderThread = new Thread(new ClientLoaderRunnable(this));
		cientLoaderThread.start();
		hDresserThread.start();
		new Thread(new ManagerRunnable(this)).start();

	}

	public synchronized void loadWaitingRooms() {
		Client client = null;
		ArrayBlockingQueue<Client> queue;
		for (WaitingRoom wtRoom : wtRooms) {
			queue = wtRoom.getQueue();
			if (queue.remainingCapacity() > 0) {
				try {
					client = new Client(this);

					System.out.println("Putting client " + client.getId()
							+ " into WaitingRoom #" + wtRoom.getId());
					queue.put(client);
					break;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		if (client == null) {
			System.out
					.println("No single empty place in all waiting rooms. I'm leaving this Barbers Shop!");
		}
		try {
			Thread.sleep((rand.nextInt(2) + 1) * MIN_WAIT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public HairDresser gethDresser() {
		return hDresser;
	}

	public void sethDresser(HairDresser hDresser) {
		this.hDresser = hDresser;
	}

	public WorkingRoom getWkRoom() {
		return wkRoom;
	}

	public void setWkRoom(WorkingRoom wkRoom) {
		this.wkRoom = wkRoom;
	}

	public int getId() {
		return id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BarbersShop.count = count;
	}

	public List<WaitingRoom> getWtRooms() {
		return wtRooms;
	}

	public void setWtRooms(List<WaitingRoom> wtRooms) {
		this.wtRooms = wtRooms;
	}

	public boolean isOperationTime() {
		return operationTime;
	}

	public void setOperationTime(boolean operationTime) {
		this.operationTime = operationTime;
	}

}
