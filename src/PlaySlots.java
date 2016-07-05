import java.util.*;
public class PlaySlots
{
	public static void main(String[] argsv)
	{
		Scanner in = new Scanner(System.in);
		SlotMachine bob = new SlotMachine();
		
		System.out.println("1: pull lever\n2:quit");
		int sel = in.nextInt();
		
		while (sel == 1)
		{
			bob.pullLever();
			bob.displayRollers();
			bob.displayResults();
			System.out.println("1: pull lever\n2:quit");
			sel = in.nextInt();
		}
	}
}
