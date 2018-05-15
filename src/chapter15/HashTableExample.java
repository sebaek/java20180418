package chapter15;

import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashTable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("아이디 :");
			String id = scanner.nextLine();
			
			System.out.println("아이디 :");
			String id = scanner.nextLine();
		}
	}
}
