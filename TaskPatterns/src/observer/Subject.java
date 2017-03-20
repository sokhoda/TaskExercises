package observer;

import java.util.ArrayList;

import observer.observers.IObserver;

public class Subject implements IObservable {

	private ArrayList<IObserver> observers = new ArrayList<>();
	private int state;

	public Subject(int state) {
		this.state = state;
	}

	public void stateChanged() {
		notifyAllUpdate();
	}

	@Override
	public void notifyAllUpdate() {
		for (IObserver iObserver : observers) {
			iObserver.update(this);
		}
	}

	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}

	public ArrayList<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<IObserver> observers) {
		this.observers = observers;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		stateChanged();
	}

}
