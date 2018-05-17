package chapter12;

public class ThreadExample1 {
	private static long i = 0;
	
	public static void main(String[] args) throws Exception {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (long j = 0; j < 20000; j++) {
					i++;
				}
			}
		});
		thread.start();
		
		for (long j = 0; j < 20000; j++) {
			i++;
		}
		
		thread.join();
		System.out.println(i);
	}

}
