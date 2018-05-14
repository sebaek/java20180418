package chapter13;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		//
		
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		
		
		Box<String> box2 = new Box<String>();
		box2.set("홍길동");
//		box2.set(new Apple());
		String str2 = box2.get();
		
	}
}
