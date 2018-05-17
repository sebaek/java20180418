package chapter18.exercise07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\중앙\\Documents\\eclipse-workspace\\myjava\\src\\chapter18\\exercise07\\AddLineNumberExample.java";
				
		try {
			FileReader fis = new FileReader(filePath);
			BufferedReader bis = new BufferedReader(fis);
			String lineStr = "";
			int lineNum = 0;
			while ((lineStr = bis.readLine()) != null) {
				System.out.printf("%03d : %s\n", ++lineNum, lineStr);
			}
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
