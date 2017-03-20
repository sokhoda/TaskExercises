package adapter;

public class FrameWork {
	public static void main(String[] args) {
		Adapter adapter = new ConcreteAdapter();
		adapter.setLoudness(10);
		adapter.playChord("a");
	}
}
