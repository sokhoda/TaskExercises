package mediator;

import mediator.colleague.AbstractColleague;

public interface IMediator {
	void send(String message, AbstractColleague colleague);

	void addColleague(AbstractColleague colleague);

	void removeColleague(AbstractColleague colleague);
}
