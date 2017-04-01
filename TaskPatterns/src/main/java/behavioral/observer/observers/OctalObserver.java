package behavioral.observer.observers;

import behavioral.observer.IObservable;
import behavioral.observer.Subject;

public class OctalObserver implements IObserver {
	public OctalObserver(IObservable subject) {
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		System.out.println("Subject behavioral.state changed: "
				+ Integer.toOctalString(subject.getState()));

	}
}
