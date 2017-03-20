package command.receivers;

public class GarageDoor {
	private int opened;

	public GarageDoor(int opened) {
		this.opened = opened;
	}

	public void open() {
		opened = 1;
		System.out.println(this);
	}

	public void close() {
		opened = 0;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "GarageDoor [opened=" + opened + "]";
	}

}
