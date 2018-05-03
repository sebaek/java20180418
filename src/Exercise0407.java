import java.util.Scanner;

public class Exercise0407 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			String input = scanner.nextLine();
			int money = 0;
			switch (input) {
			case "1":
				System.out.println("예금액>");
				money = scanner.nextInt();
				balance += money;
				break;
			case "2":
				System.out.println("출금액>");
				money = scanner.nextInt();
				balance -= money;
				break;
			case "3":
				System.out.println("잔고>" + balance);
				break;
			case "4":
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
