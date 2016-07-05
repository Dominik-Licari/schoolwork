public class PiggyBankTest
{
	public static void main (String[] argv)
	{
		PiggyBank bank = new PiggyBank();
		bank.insertDime();
		bank.insertQuarter();  
		bank.insertPenny();    
		bank.insertNickel();   
		bank.insertQuarter();  
		bank.insertDime();     
		bank.insertPenny(); 
		System.out.println("Smash!");
		System.out.println("You got " + bank.breakBank() + " cents.");
		System.out.println();
	}
}
