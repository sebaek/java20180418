package chapter15.exercise07;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(null);
		
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
