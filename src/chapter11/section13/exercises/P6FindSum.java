package chapter11.section13.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class P6FindSum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		int findSumValue = 15;
		
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(10));
		}
		Collections.sort(list);
		System.out.println(list);

		// 더해서 15가 되는 두 수가 있는 지 찾으세요.
		// 있으면 두 수 출력. 없으면 없다고 출력.
		int left = 0;
		int right = list.size()-1;
		boolean find = false;
		while (left < right) {
			int num = list.get(left) + list.get(right);
			if (num == findSumValue) {
				System.out.println(list.get(left) + ", " + list.get(right));
				right--;
				left++;
				find = true;
			} else if (num > findSumValue) {
				right--;
			} else {
				left++;
			}
		}
		
		if (!find) {
			System.out.println("더해서 " + findSumValue + "가 되는 두 수가 없습니다.");
		}
	}

}
