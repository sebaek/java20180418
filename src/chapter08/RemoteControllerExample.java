package chapter08;

public class RemoteControllerExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		RemoteControl rc3 = new SmartTelevision();
		rc3.turnOn();
		rc3.turnOff();
		rc3.setVolume(2);
		Searchable rc4 = (Searchable) rc3;
		rc4.search("url");
		
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("익명구현객체 turnOn()메소드");
			}
			@Override
			public void turnOff() {
				System.out.println("익명구현객체 turnOff()메소드");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("익명구현객체 setVolume() 메소드");
			}
		};
	}
}
