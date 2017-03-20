package prototype;

public class ProtoRunner {
	public static void main(String[] args) {
		ShapeCache.loadChache();

		System.out.println(ShapeCache.getShape("1").getType());

		System.out.println(ShapeCache.getShape("2").getType());
	}
}
