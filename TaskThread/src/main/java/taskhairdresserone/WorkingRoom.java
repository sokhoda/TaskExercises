package taskhairdresserone;

import java.util.concurrent.ArrayBlockingQueue;

public class WorkingRoom {
	private static int count;
	private int id;
	private ArrayBlockingQueue<Client> queue;
	private int size;

	public WorkingRoom(int size) {
		this.id = count++;
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
