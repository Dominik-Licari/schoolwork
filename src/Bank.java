public class Bank
{
	private double checkingBal;
	private double savingsBal;
	private String name;
	public Bank()
	{
		name = "...b.l.a.n.k...";
		checkingBal = 0.0;
		savingsBal = 0.0;
	}
	public Bank(String n)
	{
		name = n;
		checkingBal = 0.0;
		savingsBal = 0.0;
	}
	public Bank(String n, double c)
	{
		name = n;
		checkingBal = c;
		savingsBal = 0.0;
	}
	public Bank(String n, double c, double s)
	{
		name = n;
		checkingBal = c;
		savingsBal = s;
	}
	
	public double getChecking()
	{
		return checkingBal;
	}
	
	public double getSavings()
	{
		return savingsBal;
	}
	
	public double getCombined()
	{
		return checkingBal + savingsBal;
	}
	
	public void checkingDeposit(double amount)
	{
		checkingBal += amount;
	}
	
	public void savingsDeposit(double amount)
	{
		savingsBal += amount;
	}
	
	public void checkingWithdrawal(double amount)
	{
		checkingBal += amount;
	}
	
	public void savingsWithdrawal(double amount)
	{
		savingsBal += amount;
	}
	
	public void closeChecking()
	{
		checkingBal = 0;
	}
	
	public void closeSavings()
	{
		savingsBal = 0;
	}
	
	public void showBalances()
	{
		System.out.println();
		System.out.println("Account balances for " + name);
		System.out.println("Checking: $" + getChecking());
		System.out.println("Savings:  $" + getSavings());
		System.out.println("Combined: $" + getCombined());
		System.out.println();
	}
}

