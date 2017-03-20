package command.receivers;

public class GarageLight {
	private int on;

	public GarageLight(int on) {
		this.on = on;
	}

	public void switchOn() {
		on = 1;
		System.out.println(this);
	}

	public void switchOff() {
		on = 0;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "GarageLight [on=" + on + "]";
	}

}
