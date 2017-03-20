package adapter;

public class Guitar {
	private double tweakForce;

	public void playChord(int[]... stringFret) {
		for (int[] is : stringFret) {
			System.out.println(is[0] + " / " + is[1]);
		}
	}

	public void tweak(double force) {
		tweakForce = force;
		System.out.println("tweak:" + tweakForce);
	}
}
