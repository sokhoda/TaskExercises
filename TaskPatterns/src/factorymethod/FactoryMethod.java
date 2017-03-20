package factorymethod;

public class FactoryMethod {
	public static Vehicle getInstance(Model model) {
		Vehicle res = null;
		if (model == Model.BMW) {
			res = new BMW();
		} else if (model == Model.OPEL) {
			return new Opel();
		} else if (model == Model.MERCEDES) {
			return new Mercedes();
		}
		return res;
	}
}
