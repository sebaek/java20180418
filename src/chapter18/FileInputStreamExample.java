package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(
					"C:\\Users\\중앙\\Documents\\eclipse-workspace\\myjava\\src\\chapter18\\FileInputStreamExample.java");
			int data;
			while ( (data = fis.read()) != -1) {
				System.out.write(data);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}
}
