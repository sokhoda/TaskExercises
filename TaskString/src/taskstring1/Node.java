package taskstring1;

public class Node {

	private String value;
	private int entries;

	public Node(String value, int entries) {
		this.value = value;
		this.entries = entries;
	}

	public void incrementEntries() {
		setEntries(getEntries() + 1);
	}

	public void decrementEntries() {
		int i = getEntries();
		if (i > 0) {
			setEntries(i - 1);
		}
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setEntries(int entries) {
		this.entries = entries;
	}

	public String getValue() {
		return value;
	}

	public int getEntries() {
		return entries;
	}

	@Override
	public String toString() {
		return "\nNode [value=" + value + ", entries=" + entries + "]";
	}

}