public class BankAccount {

	private String id;
	private double balance;
	private int transactions;

	public BankAccount(String id) {
		this.id = id;
		this.balance = 0;
		this.transactions = 0;
	}

	public String getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getTransactions() {
		return this.transactions;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			this.transactions++;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			this.balance -= amount;
			this.transactions++;
		}
	}
}