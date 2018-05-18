package chapter11.excercise;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] stra = str.split(",");
		
		for (String string : stra) {
			System.out.println(string);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}

