package chapter14.section1405;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach(n -> System.out.println(n));
		
//		for (int i = 0; i < list.size(); i++) {
//			list.set(i, list.get(i) * list.get(i));
//		}
		list.replaceAll(n -> n*n);
		
		list.forEach(n -> System.out.println(n));
		
		
		
		
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값: " + max);
		
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값: " + min);
	}
}
