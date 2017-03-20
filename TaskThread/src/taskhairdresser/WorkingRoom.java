package taskhairdresser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class WorkingRoom {
	private int id;
	private ArrayBlockingQueue<Client> queue;
	private int size;

	public static List<WorkingRoom> produceWorkingRoom(int[] wkRooms) {
		List<WorkingRoom> list = new ArrayList<>();
		for (int i = 0; i < wkRooms[0]; i++) {
			list.add(new WorkingRoom(i, wkRooms[1]));
		}
		return list;
	}

	public WorkingRoom(int id, int size) {
		this.id = id;
		queue = new ArrayBlockingQueue<Client>(size, true);
	}

	public WorkingRoom(ArrayBlockingQueue<Client> queue, int size) {
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
