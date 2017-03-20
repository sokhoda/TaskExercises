package bridge.abstraction;

public class NumberedList extends BaseList {

	public NumberedList() {

	}

	@Override
	public String get(int inx) {
		return inx + ". " + super.get(inx);
	}

}
