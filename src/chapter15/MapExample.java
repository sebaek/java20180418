package chapter15;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		String str = "Peter Piper picked a peck of pickled peppers.\r\n" + 
				"A peck of pickled peppers Peter Piper picked.\r\n" + 
				"If Peter Piper picked a peck of pickled peppers,\r\n" + 
				"Where's the peck of pickled peppers Peter Piper picked?";
		
		str = str.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		
		for (char key : str.toCharArray()) {
			
			if (key < 'a' || 'z' < key) {
				continue;
			}
			
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		for (Character key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

	}
}
