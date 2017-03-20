package adapter;

public class ConcreteAdapter implements Adapter {
	private Guitar guitar = new Guitar();

	@Override
	public void playChord(String chord) {
		switch (chord) {
		case "a":
			guitar.playChord(new int[][] { { 1, 2 }, { 6, 3 }, { 3, 1 } });
			break;
		case "c":
			guitar.playChord(new int[][] { { 5, 0 }, { 2, 1 }, { 3, 5 } });
			break;
		case "f":
			guitar.playChord(new int[][] { { 4, 4 }, { 2, 2 }, { 1, 1 } });
			break;
		default:
			guitar.playChord(new int[][] { { 1, 0 }, { 2, 0 }, { 3, 0 } });
		}
	}

	@Override
	public void setLoudness(int loudness) {
		guitar.tweak(loudness * 1.1 + 23);
	}

}
