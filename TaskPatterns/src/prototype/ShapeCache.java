package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	private static Map<String, Shape> cache = new HashMap<>();

	public static void loadChache() {
		Shape circle = new Circle();
		circle.setId("1");
		cache.put(circle.getId(), circle);

		Shape rectangle = new Rectangle();
		rectangle.setId("2");
		cache.put(rectangle.getId(), rectangle);
	}

	public static Shape getShape(String shapeId) {
		return (Shape) cache.get(shapeId).clone();
	}
}
