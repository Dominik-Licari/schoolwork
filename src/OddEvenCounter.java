import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

        public OddEvenCounter()
        {
                line = "";
        }
        
        public OddEvenCounter(String s)
        {
                line = s;
        }
        
	
	public int getEvenCount()
	{
		int cnt= 0;
                String[] y = line.split(" ");
		for (String x : y)
                        if (Integer.parseInt(x) % 2 == 0)
                                cnt++;
                return cnt;
	}

	public int getOddCount()
	{
		int cnt= 0;
                String[] y = line.split(" ");
		for (String x : y)
                        if (Integer.parseInt(x) % 2 == 1)
                                cnt++;
                return cnt;
	}

	public String toString( )
	{
		return line + "\nEven: " + getEvenCount() + "\nOdd:  " + getOddCount();
	}
}
