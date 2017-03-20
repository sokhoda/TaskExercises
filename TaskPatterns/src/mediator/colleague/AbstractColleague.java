package mediator.colleague;

import mediator.IMediator;

public abstract class AbstractColleague {
	private static int count;
	protected IMediator mediator;
	protected long id;

	public AbstractColleague(IMediator mediator) {
		this.id = count++;
		this.mediator = mediator;
	}

	public void send(String message) {
		mediator.send(message, this);
	}

	public abstract void receive(String message);

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof AbstractColleague)) return false;
		AbstractColleague other = (AbstractColleague) obj;
		if (other.id == id) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return new Long(id).intValue();
	}
}
