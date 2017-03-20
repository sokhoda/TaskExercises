package bridge.abstraction;

public class MergeList extends BaseList {
	private char mark;
	private static int count = 0;

	public MergeList(char mark) {
		this.mark = mark;
	}

	@Override
	public String get(int inx) {
		return String.valueOf(inx) + mark + ". " + super.get(inx);
	}

	public String get(int... inx) {
		StringBuilder sb = new StringBuilder();
		for (int i : inx) {
			sb.append(super.get(i));
		}
		return String.valueOf(count++) + mark + ". " + sb.toString();
	}

}
