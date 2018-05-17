package chapter12;

public class BeepThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.err.println("딩");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
