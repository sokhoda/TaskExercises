package delegate;

public class TeamMember {
	private int id;

	public TeamMember(int id) {
		this.id = id;
	}

	public void writeCode() {
		System.out.println("member #" + id + " Writes code");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
