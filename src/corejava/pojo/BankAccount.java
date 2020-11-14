package corejava.pojo;

import java.util.Random;
import java.util.stream.IntStream;

public class BankAccount {
	
	private static String accountNo;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	private static long MINIMUM_BALANCE;
	
	public static Long SAVINGS_ACCOUNT = 1L;
	public static Long CURRENT_ACCOUNT = 2L;
	
	public BankAccount(String accountHolderName, Long accountType,Double deposit)
	{
		if(accountType == SAVINGS_ACCOUNT)
		{
			this.accountType = "SAVINGS_ACCOUNT";
			MINIMUM_BALANCE = 500;
		}
		else if(accountType == CURRENT_ACCOUNT)
		{
			this.accountType = "CURRENT_ACCOUNT";
			MINIMUM_BALANCE = 1000;
		}
		else
		{
			throw new IllegalArgumentException("Please select an account type from the object");
		}

		if(deposit < MINIMUM_BALANCE)
		{
			throw new IllegalArgumentException("Please deposit sufficient balance to open this account : " + MINIMUM_BALANCE);
		}

		accountNo = generateAccountNumber();
		this.accountHolderName = accountHolderName;
		this.accountBalance = deposit;
		
		System.out.println("");
		System.out.println(this.accountHolderName +" Your Account opened successfully !");
		System.out.println("--Account Details--");
		System.out.println("Account No : "+accountNo);
		System.out.println("Account Holder Name : "+this.accountHolderName);
		System.out.println("Account Type : "+this.accountType);
		System.out.println("Account Balance : "+this.accountBalance);
		 
	}

	private String generateAccountNumber()
	{
		Random random = new Random();
		IntStream intStream = random.ints(65, 90).limit(12);
		StringBuilder accountNo = intStream.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
		return accountNo.toString();
	}
	
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public String getAccountNo()
	{
		return accountNo;
	}

	public void deposit(double depositAmount)
	{
		this.accountBalance = this.accountBalance + depositAmount;
		System.out.println("Deposited " + depositAmount + " in "+ this.accountHolderName +" Account. Available Balance is : " + getAccountBalance());
	}

	public void withdraw(double withdrawAmount)
	{
		if (this.accountBalance - withdrawAmount >= MINIMUM_BALANCE)
		{
			this.accountBalance = this.accountBalance - withdrawAmount;
		}
		else
		{
			throw new IllegalArgumentException("Insufficient funds");
		}
		
		System.out.println("Withdrawed " + withdrawAmount + " from "+ this.accountHolderName +" Account. Available Balance is : " + getAccountBalance());
		
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
}
