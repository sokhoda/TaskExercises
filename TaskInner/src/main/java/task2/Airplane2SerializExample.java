package task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Airplane2SerializExample {
	private File file;

	public static void main(String[] args) {
		String fname = "Airplane.txt";
		Airplane2SerializExample serObj = new Airplane2SerializExample(
				new File(fname));
		serObj.serialize();
		serObj.deSerialize();

	}

	public Airplane2SerializExample(File file) {
		this.file = file;
	}

	public void serialize() {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(file))) {
			// Airplane.AirplaneEngine.Engine engine = new
			// Airplane.AirplaneEngine().new Engine(
			// "MyEngine", 1, 120);
			// System.out.printf("%-10s %s", "orig: ", engine);
			// out.writeObject(engine);

			Airplane plane = new Airplane("MyHandMadePlane", 780);
			System.out.printf("%-10s %s", "orig: ", plane);
			out.writeObject(plane);
		} catch (NotSerializableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void deSerialize() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				file))) {
			// Airplane.AirplaneEngine.Engine engine =
			// (Airplane.AirplaneEngine.Engine) in
			// .readObject();
			// System.out.printf("\n%-10s %s", "deser: ", engine);
			Airplane plane = (Airplane) in.readObject();
			System.out.printf("\n%-10s %s", "deser: ", plane);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
