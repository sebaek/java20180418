
public class Excercise0507 {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE; 
		int[] array = { -1, -5, -3, -8, -2};
		
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("max: " + min);
	}
}
