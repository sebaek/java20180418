package chapter11.section13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindMax {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(- random.nextInt(100));
		}
		System.out.println(list);
		
		// 모두 부호를 바꾸기
		System.out.println(list);		
		// 합계 구하기
		// 평균 구하기
		// 최대값 구하기
		// 최소값 구하기
	}
}
