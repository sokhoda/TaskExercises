package observer.observers;

import observer.IObservable;
import observer.Subject;

public class HexObserver implements IObserver {
	public HexObserver(IObservable subject) {
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		System.out.println("Subject state changed: "
				+ Integer.toHexString(subject.getState()));

	}
}
