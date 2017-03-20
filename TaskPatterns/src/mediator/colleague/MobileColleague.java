package mediator.colleague;

import mediator.IMediator;

public class MobileColleague extends AbstractColleague {

	public MobileColleague(IMediator mediator) {
		super(mediator);
		super.mediator.addColleague(this);
	}

	@Override
	public void receive(String message) {
		System.out.println(id + " recieved:" + message);
	}

	@Override
	public String toString() {
		return "MobileColleague [id=" + id + "]";
	}

}
