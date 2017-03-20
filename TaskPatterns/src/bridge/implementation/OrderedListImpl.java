package bridge.implementation;

import java.util.ArrayList;

public class OrderedListImpl implements IList {
	private ArrayList<String> list = new ArrayList<>();

	@Override
	public String getItem(int inx) {
		String res = null;
		if (inx > -1 && inx < list.size()) {
			res = list.get(inx);
		}
		return res;
	}

	@Override
	public int getNumberOfItems() {
		return list.size();
	}

	@Override
	public void addItem(String item) {
		if (!list.contains(item)) {
			list.add(item);
		}
	}

	@Override
	public void addItem(String item, int pos) {
		if (!list.contains(item)) {
			list.add(pos, item);
		}

	}

	@Override
	public void removeItem(String item) {
		if (!list.contains(item)) {
			list.remove(item);
		}
	}

	@Override
	public boolean supportsOrdering() {
		return true;
	}

}
