
public class Calculator8Example {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator8.pi;
		int result2 = Calculator8.plus(10, 5);
		int result3 = Calculator8.minus(10, 5);
		
		Calculator8 cal1 = new Calculator8();
		Calculator8 cal2 = new Calculator8();
		cal1.pi = 9.9;
		System.out.println(cal2.pi);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}

