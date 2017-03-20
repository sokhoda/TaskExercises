package taskhairdresserone;

import java.util.Random;

public class Client {
	private static int counter;
	private int id;
	private int sex;
	private BarbersShop bShop;
	private ClientRunnable clientRunnable;
	private final Random rand = new Random();

	public Client(BarbersShop bShop) {
		this.id = counter++;
		this.sex = rand.nextInt(2);
		this.bShop = bShop;
		clientRunnable = new ClientRunnable(bShop.gethDresser());
		Thread clientThread = new Thread(clientRunnable);
		clientThread.setName("Client_" + id + "_Thread");
		clientThread.start();
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

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Client.counter = counter;
	}

	public BarbersShop getbShop() {
		return bShop;
	}

	public void setbShop(BarbersShop bShop) {
		this.bShop = bShop;
	}

	public Random getRand() {
		return rand;
	}

	public ClientRunnable getClientRunnable() {
		return clientRunnable;
	}

	public void setClientRunnable(ClientRunnable clientRunnable) {
		this.clientRunnable = clientRunnable;
	}

}
