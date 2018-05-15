package chapter15.exercise09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		for (String key : map.keySet()) {
			int value = map.get(key);
			totalScore += value;
			if (value > maxScore) {
				maxScore = value;
				name = key;
			}
		}
		
		System.out.println("평균점수: " + totalScore / map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수 아이디: " + name);
	}
}
