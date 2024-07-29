
public class SavingsAccount extends BankAccount{
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		
		accountNumber = super.getAccountNumber() + "-" + String.valueOf(savingsNumber);
		savingsNumber++;
	}
	
	
	public SavingsAccount(SavingsAccount myAcc, double amount) {
		super(myAcc, amount);
		
		accountNumber = super.getAccountNumber() + "-" + String.valueOf(savingsNumber + 1);
		savingsNumber++;
	}
	
	void postInterest() {
		double interestToAdd = super.getBalance() * rate;	
		super.deposit(interestToAdd);
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
}
