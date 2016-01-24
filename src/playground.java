import java.util.Scanner;
public class playground
{
    public static void main(String[] argsv)
    {
	int[] z = {0, 1 ,2, 3, 4};
	int y = 5;
	prl("the answer is " + 3 + 5);
	prl("x = " + y);
	double x = ((double) z[1] + z[4]) / z[2];
	for (int i = 1; i < z.length; i+=2)
		  prl(i);
	for (int i : z)
		  prl(i);
       String answer = "";
       Scanner in = new Scanner(System.in);
       while (!answer.equals("42")) 
	   {
	       prl("What is the answer to life, the universe, and everything?");
	       answer = in.nextLine();
	   } 
       
       in.close();
    }
    public static void prl(String in) //making a method
    {
	System.out.println(in);
    }
    public static void prl(int in) //making a method
    {
	System.out.println(in);
    }
    public static void prl(double in) //making a method
    {
	System.out.println(in);
    }
}
