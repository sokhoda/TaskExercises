package abstractfactory;

public enum Color {
	YELLOW("жовтий"), RED("червоний"), BLACK("чорний"), WHITE("білий"), BLUE(
			"синій");

	public static final int ENUM_LENGTH = Color.values().length;
	private String colorUkr;

	private Color(String colorUkr) {
		this.colorUkr = colorUkr;
	}

	public String getColorUkr() {
		return colorUkr;
	}
}
