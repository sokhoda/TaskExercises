package delegate;

import java.util.Arrays;

public class Team {
	private TeamMember[] members;
	private Stewardess stewardess;

	public Team(int size) {
		members = new TeamMember[size];
		Arrays.setAll(members, i -> {
			return new TeamMember(i);
		});
		stewardess = new Stewardess();

	}

	public void writeCode() {
		for (TeamMember teamMember : members) {
			teamMember.writeCode();
		}
	}

	public void makeCoffee() {
		stewardess.makeCoffe();
	}

}
