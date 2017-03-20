package state;

public class LifecycleRunner {
	public static void main(String[] args) {
		ServletLifeCycle lc = new ServletLifeCycle();
		System.out.println("Now I'm in " + lc.getCurState());
		lc.nextState();
	}
}
