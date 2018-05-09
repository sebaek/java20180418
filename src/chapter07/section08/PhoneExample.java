package chapter07.section08;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone("삼다수");
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
