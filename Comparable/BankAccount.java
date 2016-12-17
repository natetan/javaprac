public class BankAccount {

	private String name;
	private String id;
	private double balance;
	private int transactions;

	public BankAccount(String name, String id) {
		this.name = name;
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

	public boolean transactionFee(double fee) {
		if (this.balance == 0) {
			return false;
		} else {
			double totalFee = 0;
			for (int i = 0; i < this.transactions; i++) {
				totalFee += fee * i;
			}
			if (this.balance >= totalFee) {
				this.balance -= totalFee;
				return true;
			} else {
				this.balance = 0;
				return false;
			}
		}
	}

	public String toString() {
		String negative = "";
		if (this.balance < 0) {
			negative = "-";
			this.balance *= -1;
		}
		this.balance = Math.round(this.balance * 100.00) / 100.00;
		return this.name + ", " + negative + "$" + this.balance;
	}
}