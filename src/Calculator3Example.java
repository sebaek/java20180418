
public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		double result1 = myCal.areaRectangle(10);
		
		double result2 = myCal.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}
}
