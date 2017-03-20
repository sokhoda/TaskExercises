package observer;

import observer.observers.IObserver;

public interface IObservable {

	void addObserver(IObserver observer);

	void removeObserver(IObserver observer);

	void notifyAllUpdate();

}
