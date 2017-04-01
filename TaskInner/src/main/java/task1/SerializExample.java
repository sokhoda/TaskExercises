package task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializExample {
	private File file;

	public static void main(String[] args) {
		String fname = "Airplane.txt";
		SerializExample serObj = new SerializExample(new File(fname));
		serObj.serialize();
		// serObj.deSerialize();

	}

	public SerializExample(File file) {
		this.file = file;
	}

	public void serialize() {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(file))) {
			Airplane plane = new Airplane("MyPlane", 120);
			Airplane.AirplaneEngine.Engine engine = plane.getEngine1().new Engine(
					"MyEngine", -1, 4000);
			System.out.println("orig: " + engine);
			out.writeObject(engine);
		} catch (NotSerializableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void deSerialize() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				file))) {
			Airplane.AirplaneEngine.Engine engine = (Airplane.AirplaneEngine.Engine) in
					.readObject();
			System.out.println("deserialized: " + engine);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
