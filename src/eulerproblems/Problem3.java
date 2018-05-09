package eulerproblems;

public class Problem3 {
	public static void main(String[] args) {
		long num = 600851475143L;
		solution1(num);
		solution2(num);
	}
	
	public static void solution2(long num) {
		long counter = 2;
		long largestFact = 0;
		while (counter * counter <= num) {
			if (num % counter == 0) {
				num /= counter;
			} else {
				counter++;
			}
		}
		
		if (num > largestFact) {
			largestFact = num;
		}
		System.out.println(largestFact);
	}
	
	public static void solution1(long num) {
		long m = (long) Math.sqrt(num);
		for (long i = m; i >= 2; i--) {
			if (num % i == 0) {
				if (isPrime(i)) {
					System.out.println(i);
					return;
				}
			}
		}
		
	}
	
	public static boolean isPrime(long n) {
		long m = (long) Math.sqrt(n);
		for (long i = 2; i < m; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
