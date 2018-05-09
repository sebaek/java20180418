package eulerproblems;

public class Problem1 {
	public static void main(String[] args) {
		solution1();
		solution2();
		
	}
	
	public static void solution2() {
		System.out.println(sum(3, 999) + sum(5, 999) - sum(15, 999));
	}
	
	public static long sum(long n, long p) {
		return n * (p/n) * ((p/n)+1) / 2;
	}
	
	public static void solution1() {
		long sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
