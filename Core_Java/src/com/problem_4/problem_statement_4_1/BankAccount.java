package com.problem_4.problem_statement_4_1;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;

	public BankAccount() {
	}

	public BankAccount(int accNo, String custName, String accType, float balance)
			throws NegativeBalanceException, LowBalanceException {
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		if (accType.equals("Savings"))
			if (balance < 0)
				throw new NegativeBalanceException("Balance cannot Not be Negative");
			else if (balance < 1000)
				throw new LowBalanceException("Balance Your Entered is Low for " + this.accType);
			else
				this.balance = balance;
		if (accType.equals("Current"))
			if (balance < 0)
				throw new NegativeBalanceException("Balance cannot be negative is Negative");
			else if (balance < 5000)
				throw new LowBalanceException("Balance Your Entered is Low for " + this.accType);
			else
				this.balance = balance;
	}

	public void deposit(float amt) throws NegativeAmountException {
		if (amt > 0)
			balance += amt;
		else
			throw new NegativeAmountException("Amount You Entered is Negative ");
	}

	public void withdraw(float amt) throws InsuficientFundsException {
		if (accType.equals("Savings"))
			if (balance < 1000)
				throw new InsuficientFundsException("Insuficient Funds");
			else {
				if (amt < balance) {
					System.out.println(amt + " is credited from your account.");
					balance -= amt;
					System.out.println("Your current balance is: " + balance);
				} else
					System.out.println(
							"Tranaction Cannot proceed ! Amount you entered is more than Your Current Balance");
			}

		if (accType.equals("Current"))
			if (balance < 5000)
				throw new InsuficientFundsException("Insuficient Funds");
			else {
				if (amt < balance) {
					System.out.println(amt + " is credited from your account.");
					balance -= amt;
					System.out.println("Your current balance is " + balance);
				} else
					System.out.println(
							"Tranaction Cannot proceed ! Amount you entered is more than Your Current Balance");
			}
	}

	public float getBalance() throws LowBalanceException {
		if (accType.equals("Savings"))
			if (balance < 1000)
				throw new LowBalanceException("Your Account Balance is low : " + balance);
			else
				return balance;
		if (accType.equals("Current"))
			if (balance < 5000)
				throw new LowBalanceException("Your Account Balance is low : " + balance);
			else
				return balance;

		return balance;
	}

	public String toString() {
		return "BankAccount [accNo=" + accNo + ", custName=" + custName + ", accType=" + accType + ", balance="
				+ balance + "]";
	}
}

class LowBalanceException extends Exception {
	public LowBalanceException() {
	}

	public LowBalanceException(String str) {
		super(str);
	}
}

class NegativeBalanceException extends Exception {
	public NegativeBalanceException() {
	}

	public NegativeBalanceException(String str) {
		super(str);
	}
}

class NegativeAmountException extends Exception {
	public NegativeAmountException() {
	}

	public NegativeAmountException(String str) {
		super(str);
	}
}

class InsuficientFundsException extends Exception {
	public InsuficientFundsException() {
	}

	public InsuficientFundsException(String str) {
		super(str);
	}
}