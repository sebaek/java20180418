package chapter11.section12;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = Integer.valueOf(100);
		System.out.println("value: " + obj1.intValue());
		
		int value = obj1;
		int value2 = obj2.intValue();
		System.out.println("value: " + value);
		
		int result = obj1 + 100;
		System.out.println("result: " + result);
	}
}

