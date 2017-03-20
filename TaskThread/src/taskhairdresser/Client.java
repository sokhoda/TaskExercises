package taskhairdresser;

import java.util.Random;

public class Client {
	private static int counter;
	private int id;
	private int sex;
	private final Random rand = new Random();

	public Client() {
		this.id = counter++;
		this.sex = rand.nextInt(2);
	}

	public Client(int id, int sex) {
		this.id = id;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
