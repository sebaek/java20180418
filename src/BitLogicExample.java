
public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		
		int[] list = {1, 2, 2, 3, 1};
		
		int s = 0;
		for (int i : list) {
			s = s ^ i;
		}
		
		System.out.println("결과는 : " + s);
	}
}
