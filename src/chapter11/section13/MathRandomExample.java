package chapter11.section13;

public class MathRandomExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("주사위의 눈: " + num);
	}
}
