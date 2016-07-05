public class SlotMachine 
{
	private int roller1, roller2, roller3;
	private final int CHERRIES = 0;
	private final int APPLE = 1;
	private final int ORANGE= 2;
	private final int LEMON = 3;
	private final int BANANA = 4;
	
	public void pullLever()
	{
		roller1 = (int)(Math.random() * 5);
		roller2 = (int)(Math.random() * 5);
		roller3 = (int)(Math.random() * 5);
	}
	public void displayRollers()
	{
		switch(roller1)
		{
		case CHERRIES: 
			System.out.print("Cherries ");
			break;
		case APPLE: 
			System.out.print("Apple ");
			break;
		case ORANGE: 
			System.out.print("Orange ");
			break;
		case LEMON: 
			System.out.print("Lemon ");
			break;
		case BANANA: 
			System.out.print("Banana ");
			break;
		}
		switch(roller2)
		{
		case CHERRIES: 
			System.out.print("Cherries ");
			break;
		case APPLE: 
			System.out.print("Apple ");
			break;
		case ORANGE: 
			System.out.print("Orange ");
			break;
		case LEMON: 
			System.out.print("Lemon ");
			break;
		case BANANA: 
			System.out.print("Banana ");
			break;
		}
		switch(roller3)
		{
		case CHERRIES: 
			System.out.println("Cherries ");
			break;
		case APPLE: 
			System.out.println("Apple ");
			break;
		case ORANGE: 
			System.out.println("Orange ");
			break;
		case LEMON: 
			System.out.println("Lemon ");
			break;
		case BANANA: 
			System.out.println("Banana ");
			break;
		}
	}
	private int getPayOut()
	{
		int x = (int)(Math.random() * 10);
		if (x < 6)
			return (int)(Math.random() * 10);
		if (x < 9)
			return (int)(Math.random() * 90) + 11;
		return 10000;
	}
	public void displayResults()
	{
	       if (roller1 == roller2 && roller2 == roller3)
	       {
		       System.out.println("*******************\nWINNA WINNA CHICKIN DINNA!\n*******************\nYou won $" + getPayOut());
	       }
	       else
		       System.out.println("You lost. Wanna try again?");
	}
	
}
