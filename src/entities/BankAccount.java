package entities;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;

	public BankAccount() {
	}

	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public BankAccount(int accountNumber, String accountHolder) {
		this(accountNumber, accountHolder, 0.0);
	}

	public synchronized void depositFunds(double amount) {
		balance += amount;
	}

	public synchronized void withdrawFunds(double amount) {
//		if(balance >= amount) {
//			balance -= amount;
//		} else {
//			throw new IllegalArgumentException("THE AMOUNT SHOULDN'T BE SMALLER THAN THE ACCOUNT BALANCE!");
//		}
		balance -= (amount + 5);
	}

	public double getBalance() {
		return balance;
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

}
