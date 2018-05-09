package eulerproblems;

public class Problem2 {
	public static void main(String[] args) {
		long value = 2;
		long[] lastTwoTerms = {1, 2};
		long sum = 0;
		
		while (value < 4000000) {
			if (value % 2 == 0) {
				sum += value;
			}
			value = nextValue(lastTwoTerms);
		}
		System.out.println(sum);
	}

	private static long nextValue(long[] lastTwoTerms) {
		long next = lastTwoTerms[0] + lastTwoTerms[1];
		lastTwoTerms[0] = lastTwoTerms[1];
		lastTwoTerms[1] = next;
		return next;
	}
}
