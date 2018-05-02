
public class Exercise0406 {
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 5; i++) {
			str = "";
			for (int j = 0; j <= i; j++) {
				str += "*";
			}
			System.out.println(str);
		}
	}
}
