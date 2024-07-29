
public class CheckingAccount extends BankAccount{
	
	final private static double FEE = 0.15;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		boolean completed = true;
		
		amount += FEE;

		if (amount <= super.getBalance())
		{
			super.setBalance(super.getBalance() - amount);;
		}
		else
		{
			completed = false;
		}
		return completed;
	}
	
	
	
	
}
