package behavioral.observer.observers;

import behavioral.observer.IObservable;
import behavioral.observer.Subject;

public class BinaryObserver implements IObserver {
	public BinaryObserver(IObservable subject) {
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		System.out.println("Subject behavioral.state changed: "
				+ Integer.toBinaryString(subject.getState()));

	}
}
