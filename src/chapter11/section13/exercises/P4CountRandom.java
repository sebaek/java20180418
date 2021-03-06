package chapter11.section13.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class P4CountRandom {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(3));
		}
		System.out.println(list);

		// 0, 1, 2가 몇 개씩 있는 지 출력해보세요. 없으면 출력하지 마세요.
		Map<Integer, Integer> map = new HashMap<>();

		for (Integer e : list) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		
		System.out.println(map);
	}
}








