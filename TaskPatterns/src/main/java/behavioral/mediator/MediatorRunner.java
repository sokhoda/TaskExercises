package behavioral.mediator;

import behavioral.mediator.colleague.AbstractColleague;
import behavioral.mediator.colleague.MobileColleague;
import behavioral.mediator.colleague.UkraineColleague;

public class MediatorRunner {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		AbstractColleague ukrCol = new UkraineColleague(mediator);
		AbstractColleague mobCol = new MobileColleague(mediator);
		AbstractColleague mobCol2 = new MobileColleague(mediator);
		AbstractColleague ukrCol2 = new UkraineColleague(mediator);

		mediator.addColleague(ukrCol);
		mediator.addColleague(new MobileColleague(mediator));

		System.out.println(mediator.getColleagues());
		ukrCol.send("Hallo everybody!");
		mobCol.send("Hi Ukraine!");
	}
}
