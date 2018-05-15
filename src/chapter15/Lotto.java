package chapter15;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 6) {
			set.add((int) (Math.random() * 45 + 1)); 
		}
		
		System.out.println(set);
	}
}
