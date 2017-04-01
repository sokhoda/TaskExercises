package behavioral.observer.observers;

import behavioral.observer.IObservable;
import behavioral.observer.Subject;

public class HexObserver implements IObserver {
	public HexObserver(IObservable subject) {
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		System.out.println("Subject behavioral.state changed: "
				+ Integer.toHexString(subject.getState()));

	}
}
