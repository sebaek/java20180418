package chapter11.section11;

import chapter06.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class class1 = car.getClass();
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getPackage().getName());
		System.out.println();
		
		Class class3 = Car.class;
		System.out.println(class3.getName());
		System.out.println(class3.getSimpleName());
		System.out.println(class3.getPackage().getName());
		System.out.println();
		
		try {
			Class class2 = Class.forName("chapter06.Car");
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
			System.out.println(class2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
