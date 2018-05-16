package chapter11.section13.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P3FindDuplicate {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(10));
		}
		System.out.println(list);
		
		// list에 저장된 수 중 중복 저장된 수를 출력하세요.
	}
}
