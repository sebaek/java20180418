package chapter06.exercise.p19;

public class Account {

	private int balance;
	static final private int MAX_BALANCE = 1000000;;
	static final private int MIN_BALANCE = 0;

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return this.balance;
	}
	
}
