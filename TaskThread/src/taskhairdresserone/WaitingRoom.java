package taskhairdresserone;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class WaitingRoom {
	private int id;
	private ArrayBlockingQueue<Client> queue;
	private int size;

	public static List<WaitingRoom> produceWaitingRoom(final int[] wtRooms) {
		List<WaitingRoom> list = new ArrayList<>();
		for (int i = 0; i < wtRooms[0]; i++) {
			list.add(new WaitingRoom(i, wtRooms[1]));
		}
		return list;
	}

	public WaitingRoom(int id, int size) {
		this.id = id;
		queue = new ArrayBlockingQueue<Client>(size, true);
	}

	public WaitingRoom(ArrayBlockingQueue<Client> queue, int size) {
		this.queue = queue;
		this.size = size;
	}

	public ArrayBlockingQueue<Client> getQueue() {
		return queue;
	}

	public void setQueue(ArrayBlockingQueue<Client> queue) {
		this.queue = queue;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
