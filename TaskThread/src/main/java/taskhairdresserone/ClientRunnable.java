package taskhairdresserone;

public class ClientRunnable implements Runnable {
	private HairDresser hDresser;
	private boolean alreadyServiced;

	public ClientRunnable(HairDresser hDresser) {
		this.hDresser = hDresser;
		alreadyServiced = false;
	}

	@Override
	public void run() {
		while (!alreadyServiced) {
			hDresser.wakeUpHDresser(this);
		}
	}

	public HairDresser gethDresser() {
		return hDresser;
	}

	public void sethDresser(HairDresser hDresser) {
		this.hDresser = hDresser;
	}

	public boolean isAlreadyServiced() {
		return alreadyServiced;
	}

	public void setAlreadyServiced(boolean alreadyServiced) {
		this.alreadyServiced = alreadyServiced;
	}

}
