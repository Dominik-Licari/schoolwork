import java.util.Scanner;

public class ticket
{
    public static void main(String[] argsv)
    {
	Scanner in = new Scanner(System.in);
	loop:
	while (true)
        {
	    prl("Limit?");
	    int limit = in.nextInt();
	    prl("Speed?");
	    int speed = in.nextInt();
	    prl("School zone?");
	    in.nextLine();
	    String school = in.nextLine(); 
	    int fine = (speed > limit) ? (75 + (speed - limit) * 6) : 0;
	    fine += (speed - limit > 30) ? 160 : 0;
	    fine = (school.equalsIgnoreCase("y")) ? fine*2 : fine;
	    prl("Fine: " + fine);
	    prl("More?");
	    String cont = in.nextLine();
	    if (cont.equalsIgnoreCase("n"))
		break loop;
	}
	       
    }
    public static void prl(String in) //making a method
    {
	System.out.println(in);
    }
}
