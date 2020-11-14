package corejava.classes;

import corejava.pojo.BankAccount;

public class BankSimulator {

	public static void main(String[] args) {

		/* Opening two accounts */
		BankAccount saiAccount = new BankAccount("Sai", BankAccount.SAVINGS_ACCOUNT, 2000D);
		BankAccount hariniAccount = new BankAccount("Harini", BankAccount.CURRENT_ACCOUNT, 20000D);
		
		/* Depositing into Sai's Account */
		depositAmount(saiAccount,2500D);
		
		/* Withdrawing from Harini's Account */
		withdrawAmount(hariniAccount,500D);
		
		/* Transferring Amount from Sai's Account to Harini Account */;
		transferAmount(saiAccount,hariniAccount,500D);
	}
	
	public static void transferAmount(BankAccount fromAccount, BankAccount toAccount,Double transferAmount)
	{
		System.out.println("");
		System.out.println("Transfer Intiated..");
		withdrawAmount(fromAccount,transferAmount);
		depositAmount(toAccount,transferAmount);
		System.out.println("");
		System.out.println("Transfer Completed..");
	}
	
	public static void withdrawAmount(BankAccount withdrawAccount,Double withdrawAmount)
	{
		System.out.println("");
		System.out.println("Withdraw Intiated..");
		System.out.println("Current Balance in " + withdrawAccount.getAccountHolderName() + " Account : " + withdrawAccount.getAccountBalance());
		withdrawAccount.withdraw(withdrawAmount);
		System.out.println("Withdraw completed..");
	}
	
	public static void depositAmount(BankAccount depositAccount,Double depositAmount)
	{
		System.out.println("");
		System.out.println("Deposit Intiated..");
		System.out.println("Current Balance in " + depositAccount.getAccountHolderName() + " Account : " + depositAccount.getAccountBalance());
		depositAccount.deposit(depositAmount);
		System.out.println("Deposit completed..");
	}

}
