package observer.observers;

import observer.IObservable;
import observer.Subject;

public class BinaryObserver implements IObserver {
	public BinaryObserver(IObservable subject) {
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		System.out.println("Subject state changed: "
				+ Integer.toBinaryString(subject.getState()));

	}
}
