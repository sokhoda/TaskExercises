package taskhairdresserone;

public class ClientServiceLog {
	private static long count;
	private long id;
	private long clientId;
	private CutType cutType;
	private int price;

	public ClientServiceLog(long clientId, CutType cutType, int price) {
		this.id = count++;
		this.clientId = clientId;
		this.cutType = cutType;
		this.price = price;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public CutType getCutType() {
		return cutType;
	}

	public void setCutType(CutType cutType) {
		this.cutType = cutType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
