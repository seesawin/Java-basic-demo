package tw.com.seesawin.ex08;

public class Thread2 {
	public static void main(String[] args) {
		Account account = new Account();

		MoneyOut out1 = new MoneyOut(account, "1");
		Thread out1T1 = new Thread (out1);
		out1T1.start();
		
		MoneyIn in1 = new MoneyIn(account, "1");
		Thread in1T1 = new Thread (in1);
		in1T1.start();

	}
}

class MoneyOut implements Runnable {
	private Account account;
	private String name;
	public MoneyOut(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			int amount = account.withdraw(100);
			System.out.println("MoneyOut" + name + ": " + amount);
		}
	}
}

class MoneyIn implements Runnable {
	private Account account;
	private String name;
	public MoneyIn(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			account.deposit(1000);
			System.out.println("MoneyIn" + name + ": " + 100);
		}
	}
}
class Account {
	private int balance;
	public synchronized int deposit(int amount) {
		balance = balance + amount;
		return balance;
	}
	public int withdraw(int amount) {
		int result = 0;
		synchronized(this) {
			if (balance > amount) {
				balance = balance - amount;
				result = amount;
			}
		}
		return result;
	}
}
