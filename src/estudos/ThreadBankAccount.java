package estudos;

import entities.BankAccount;

public class ThreadBankAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Thread threadDeposit = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				account.depositFunds(10);
			}
		});
		
		Thread threadWithdraw = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				account.withdrawFunds(10);
			}
		});
		
		threadDeposit.start();
		threadWithdraw.start();
		
		try {
			threadDeposit.join();
			threadWithdraw.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance: " + account.getBalance());
	}

}
