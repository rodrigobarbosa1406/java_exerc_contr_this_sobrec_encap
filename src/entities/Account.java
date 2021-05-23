package entities;

public class Account {
	private static final double WITHDRAW_TAX = 5.00;
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account() {
	}

	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit (double value) {
		updateBalance(value);
	}
	
	public void withdraw (double value) {
		value += WITHDRAW_TAX;
		value = (value * -1);
		updateBalance(value);
	}
	
	public void updateBalance(double value) {
		this.balance += value;
	}
	
	public String toString() {
		String accountData;
		
		accountData =	"Account "
						+ getAccountNumber()
						+ ", Holder: "
						+ getAccountHolder()
						+ ", Balance: $ "
						+ String.format("%.2f", getBalance())
						+ "\n";
		
		return accountData;
	}
}
