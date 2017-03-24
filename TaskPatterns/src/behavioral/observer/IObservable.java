package behavioral.observer;

import behavioral.observer.observers.IObserver;

public interface IObservable {

	void addObserver(IObserver observer);

	void removeObserver(IObserver observer);

	void notifyAllUpdate();

}
