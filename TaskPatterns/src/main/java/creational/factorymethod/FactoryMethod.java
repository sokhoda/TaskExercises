package creational.factorymethod;

public class FactoryMethod {
    public static Vehicle getInstance(Model model) {
        switch (model) {
            case BMW:
                return new BMW();
            case OPEL:
                return new Opel();
            case MERCEDES:
                return new Mercedes();
            default:
                return null;
        }
    }
}