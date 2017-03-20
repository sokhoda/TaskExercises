package factorymethod;

public enum Model {
	OPEL("Germany"), VOLKSWAGEN("Germany"), PEGEOUT("France"), MERCEDES(
			"Germany"), BMW("Germany"), LANOS("Ukraine"), TAWRIA(
					"Ukraine"), MITSUBISI("Japan"), TOYOTA(
							"Japan"), RENAULT("France"), RANGE_ROVER("UK");

	public static final int ENUM_LENGTH = Model.values().length;
	private String countryOfManufacture;

	private Model(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}

	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}

	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}

	public static void printAll() {
		int i = 1;
		for (Model elem : values()) {
			System.out.println((i++) + ". " + elem);
		}
	}

}
