package observer.observers;

import observer.IObservable;
import observer.Subject;

public class OctalObserver implements IObserver {
	public OctalObserver(IObservable subject) {
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		System.out.println("Subject state changed: "
				+ Integer.toOctalString(subject.getState()));

	}
}
