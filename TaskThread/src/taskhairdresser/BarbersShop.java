package taskhairdresser;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class BarbersShop implements Runnable {

	private int id;
	private static int count;
	private List<HairDresser> hDressers;
	private List<WaitingRoom> wtRooms;
	private List<WorkingRoom> wkRooms;

	public BarbersShop(int hDressers, int[] wtRooms, int[] wkRooms) {
		this.id = count++;
		this.hDressers = new CopyOnWriteArrayList<>(
				HairDresser.produceHDresser(hDressers, this));
		this.wtRooms = Collections.synchronizedList(WaitingRoom
				.produceWaitingRoom(wtRooms));
		this.wkRooms = Collections.synchronizedList(WorkingRoom
				.produceWorkingRoom(wkRooms));
	}

	@Override
	public void run() {
		while (true) {
			for (WorkingRoom wkRoom : wkRooms) {
				ArrayBlockingQueue<Client> queue = wkRoom.getQueue();
				if (queue.remainingCapacity() > 0) {
					try {
						queue.put(new Client());
						break;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BarbersShop.count = count;
	}

	public List<HairDresser> gethDressers() {
		return hDressers;
	}

	public void sethDressers(List<HairDresser> hDressers) {
		this.hDressers = hDressers;
	}

	public List<WaitingRoom> getWtRooms() {
		return wtRooms;
	}

	public void setWtRooms(List<WaitingRoom> wtRooms) {
		this.wtRooms = wtRooms;
	}

	public List<WorkingRoom> getWkRooms() {
		return wkRooms;
	}

	public void setWkRooms(List<WorkingRoom> wkRooms) {
		this.wkRooms = wkRooms;
	}

}
