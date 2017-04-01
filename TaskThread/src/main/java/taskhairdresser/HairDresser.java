package taskhairdresser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class HairDresser implements Runnable {
	private int id;
	private boolean sleeping;
	private BarbersShop bShop;

	public static List<HairDresser> produceHDresser(int size,
			BarbersShop bShop) {
		List<HairDresser> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(new HairDresser(bShop, i, false));
		}
		return list;
	}

	public HairDresser(BarbersShop bShop, int id, boolean sleeping) {
		this.bShop = bShop;
		this.id = id;
		this.sleeping = sleeping;
	}

	@Override
	public void run() {
		List<WaitingRoom> wtRooms = bShop.getWtRooms();
		List<WorkingRoom> wkRooms = bShop.getWkRooms();
		WorkingRoom freeWkRoom;
		while (true) {
			freeWkRoom = null;
			for (WorkingRoom wkRoom : wkRooms) {
				ArrayBlockingQueue<Client> queue = wkRoom.getQueue();
				if (queue.isEmpty()) {
					freeWkRoom = wkRoom;
					break;
				}
			}
			if (freeWkRoom != null) {
				for (WaitingRoom wtRoom : wtRooms) {
					ArrayBlockingQueue<Client> queue = wtRoom.getQueue();
					if (!queue.isEmpty()) {
						try {
							doHairCut(freeWkRoom, queue.take());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			} else {
				System.out.println("Hairdresser " + id
						+ ": all working rooms are busy! I`m going to sleep.");
				sleeping = true;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void doHairCut(WorkingRoom freeWkRoom, Client client) {
		try {
			freeWkRoom.getQueue().put(client);
			int cutTime = CutType.getRandCut(client.getSex()).getCutTime();
			TimeUnit.MILLISECONDS.sleep(cutTime * 100);
			freeWkRoom.getQueue().take();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSleeping() {
		return sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}

	public BarbersShop getbShop() {
		return bShop;
	}

	public void setbShop(BarbersShop bShop) {
		this.bShop = bShop;
	}

}
