package observer;

import observer.observers.BinaryObserver;
import observer.observers.HexObserver;
import observer.observers.IObserver;
import observer.observers.OctalObserver;

public class ObserverRunner {
	public static void main(String[] args) {
		Subject sub = new Subject(12);
		IObserver octalObserver = new OctalObserver(sub);
		IObserver binaryObserver = new BinaryObserver(sub);
		IObserver hexObserver = new HexObserver(sub);

		sub.notifyAllUpdate();
		System.out.println("-------------");
		sub.setState(22);
		sub.removeObserver(octalObserver);
		sub.setState(17);
	}
}
