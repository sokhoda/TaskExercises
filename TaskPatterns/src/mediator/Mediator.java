package mediator;

import java.util.HashSet;

import mediator.colleague.AbstractColleague;

public class Mediator implements IMediator {
	private HashSet<AbstractColleague> colleagues;

	public Mediator() {
		colleagues = new HashSet<>();
	}

	@Override
	public void removeColleague(AbstractColleague colleague) {
		colleagues.remove(colleague);
	}

	@Override
	public void addColleague(AbstractColleague colleague) {
		colleagues.add(colleague);
	}

	@Override
	public void send(String message, AbstractColleague colleague) {
		for (AbstractColleague curColleague : colleagues) {
			if (!curColleague.equals(colleague)) {
				curColleague.receive(message);
			}
		}
	}

	public HashSet<AbstractColleague> getColleagues() {
		return colleagues;
	}

	public void setColleagues(HashSet<AbstractColleague> colleagues) {
		this.colleagues = colleagues;
	}

}
