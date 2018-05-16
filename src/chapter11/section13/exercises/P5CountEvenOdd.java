package chapter11.section13.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class P5CountEvenOdd {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		
		// 짝수와 홀수가 몇 개씩 있는 지 출력해보세요. 없으면 출력하지 마세요.
		Map<String, Integer> map = new HashMap<>();
		
		for (Integer e : list) {
			if (e % 2 == 0) {
				count("짝수", map);
			} else {
				count("홀수", map);
			}
		}
		System.out.println(map);
	}
	
	private static void count(String s, Map<String, Integer> map) {
		if (map.containsKey(s)) {
			map.put(s, map.get(s) + 1);
		} else {
			map.put(s, 1);
		}
	}

}
