package estudos;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		BankAccount bankAccount;
		System.out.print("Account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Make a initial deposit [S/N]? ");
		if (sc.next().toUpperCase().equals("S")) {
			System.out.print("Initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);

		} else {
			bankAccount = new BankAccount(accountNumber, accountHolder);
		}
		System.out.println("\nAccount created successfully!");
		System.out.printf("%nACCOUNT NUMBER: %d - ACCOUNT HOLDER: %s - ACCOUNT BALANCE: %.2f",
				bankAccount.getAccountNumber(), bankAccount.getAccountHolder(), bankAccount.getBalance());

		bankAccount.depositFunds(100);
		System.out.printf("%nACCOUNT NUMBER: %d - ACCOUNT HOLDER: %s - ACCOUNT BALANCE: %.2f",
				bankAccount.getAccountNumber(), bankAccount.getAccountHolder(), bankAccount.getBalance());

		bankAccount.withdrawFunds(200);
		System.out.printf("%nACCOUNT NUMBER: %d - ACCOUNT HOLDER: %s - ACCOUNT BALANCE: %.2f",
				bankAccount.getAccountNumber(), bankAccount.getAccountHolder(), bankAccount.getBalance());
		sc.close();
	}
}
