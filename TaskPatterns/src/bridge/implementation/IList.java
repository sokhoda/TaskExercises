package bridge.implementation;

public interface IList {
	String getItem(int inx);

	int getNumberOfItems();

	void addItem(String item);

	void addItem(String item, int pos);

	void removeItem(String item);

	boolean supportsOrdering();

}
