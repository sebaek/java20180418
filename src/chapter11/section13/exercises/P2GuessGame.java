package chapter11.section13.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P2GuessGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = new Random().nextInt(100) + 1;
		boolean correct = false;
		
		List<String> history = new ArrayList<>();
		
		while (!correct) {
			System.out.println("번호를 맞춰보세요. :");
			int guess = scanner.nextInt();
			if (guess == number) {
				System.out.println("정답입니다. 축하합니다.");
				for (String s : history) {
					System.out.println(s);
				}
				correct = true;
			} else if (guess < number) {
				history.add("입력한 수:" + guess + "\t" + "결과:작음");
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				history.add("입력한 수:" + guess + "\t" + "결과:큼");
				System.out.println("더 작은 수를 입력하세요.");
			}
		}
		
		scanner.close();
	}
}

