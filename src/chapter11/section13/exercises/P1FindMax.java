package chapter11.section13.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P1FindMax {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(- random.nextInt(100));
		}
		System.out.println(list);
		
		// 모두 부호를 바꾸기
		for (int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			value = - value;
			list.set(i, value);
		}
		System.out.println(list);
		
		int sum = 0;
		// 합계 구하기
		for (Integer element : list) {
			sum += element;
		}
		System.out.println(sum);
		
		// 평균 구하기
		double avg = (double) sum / list.size();
		System.out.println(avg);
		
		// 최대값 구하기
		int max = Integer.MIN_VALUE;
		for (int element : list) {
			max = Math.max(max, element);
		}
		
		System.out.println(max);
		
		
		// 최소값 구하기
		int min = Integer.MAX_VALUE;
		for (int element : list) {
			min = Math.min(min, element);
		}
		
		System.out.println(min);
	}
}








