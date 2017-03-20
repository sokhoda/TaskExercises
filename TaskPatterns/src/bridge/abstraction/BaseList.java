package bridge.abstraction;

import bridge.implementation.IList;

public class BaseList {
	protected IList implementor;

	public BaseList() {
	}

	public void add(String item) {
		implementor.addItem(item);
	}

	public void add(String item, int inx) {
		if (implementor.supportsOrdering()) {
			implementor.addItem(item, inx);
		}
	}

	public void remove(String item) {
		implementor.removeItem(item);
	}

	public int count() {
		return implementor.getNumberOfItems();
	}

	public String get(int inx) {
		return implementor.getItem(inx);
	}

	public IList getImplementor() {
		return implementor;
	}

	public void setImplementor(IList implementor) {
		this.implementor = implementor;
	}

}
