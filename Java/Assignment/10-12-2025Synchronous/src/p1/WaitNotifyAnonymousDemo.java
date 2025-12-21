package p1;

class BankAccount {
	double curentBalance;
	
	public BankAccount(double c) {
		this.curentBalance=c;
	}

	public synchronized void deposit(double amount) {
		System.out.println("Want To Depositing " + amount);
		this.curentBalance = this.curentBalance + amount;
		System.out.println("Balance After eposit: " + this.curentBalance);
		notifyAll();
	}

	public synchronized void withdraw(double amount) {
		System.out.println("Wants To Withdraw " + amount);

		while (this.curentBalance < amount) {
			System.out.println("Insufficient Fund....\nCurrent Balance : " + this.curentBalance + "\n\nWaiting...\n");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Withdrawal Interrupted");
				return;
			}
		}

		this.curentBalance = this.curentBalance - amount;
		System.out.println("Withdrawl Amount : " + amount + "\nCurrent Balance : " + this.curentBalance);
	}

	public synchronized double getBalance() {
		return this.curentBalance;
	}

}

public class WaitNotifyAnonymousDemo {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(5000);
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				account.withdraw(7000);
				System.out.println("Completed Withdrawal\n");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.deposit(5000);
				System.out.println("Completed Deposit\n");
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Final Balance: " + account.getBalance()+"\n");

	}
}