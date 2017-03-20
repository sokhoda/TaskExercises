package flyweight;

public class CoffeeContext {
	private int tableId;

	public CoffeeContext(int tableId) {
		super();
		this.tableId = tableId;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

}
