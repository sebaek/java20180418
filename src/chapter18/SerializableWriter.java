package chapter18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception {
		String name = "C:/Temp/Object.dat";
		FileOutputStream fos = new FileOutputStream(name);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classa = new ClassA();
		classa.field1 = 1;
		classa.field2.field1 = 2;
		classa.field3 = 3;
		classa.field4 = 4;
		oos.writeObject(classa);
		oos.flush();
		oos.close();
	}
}
