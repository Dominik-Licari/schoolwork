import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MMM
{
	public static void main(String[] argv)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\nTextLab06\n");
		System.out.print("Enter the quantity of random numbers  ===>>  ");
		int listSize = in.nextInt();
		System.out.println();
		Statistics intList = new Statistics(listSize);
		intList.randomize();
		intList.computeMean();
		intList.computeMedian();
		intList.computeMode();
		intList.displayStats();
		System.out.println();
	}
}
class Statistics
{

	private int list[];			// the actual array of integers
	private int size;			// user-entered number of integers in the array
	private double mean;		// used for the  80, 100 and 110 point versions
	private double median;		// used for the 100 and 110 point versions
	private int mode;			// used for the 110 point version only
	
	public Statistics(int s)
	{
		size = s;
		list = new int[size];
		mean = median = mode = 0;
	}

	public void randomize()
	{
		// This provided method creates the same exact list of "random" numbers for every execution.
		// You will learn more about this in Chapter 14.  For now just use the provided method.
		Random rand = new Random(12345);
		for (int k = 0; k < size; k++)
			list[k] = rand.nextInt(31) + 1;  // range of 1..30
	}
	
	public void computeMean()
	{
		double sum = 0;
		for (int i = 0; i < size; i++)
		{
			sum += list[i];
		}
		mean = sum/size;
	}

	public void computeMedian()
	{
		Arrays.sort(list);
		if (size % 2 == 0)
		{
			double x = list[size/2] + list[(size-1)/2];
			median = x/2;
		}
		else
		{
			median = list[size/2];
		}
	}

	public void computeMode()
	{
		// precondition: The list array has exactly 1 mode.
		int[] counts = new int[size];
		for (int i = 0; i < size; i++)
		{
			for (int x : list)
			{
				if (list[i] == x)
				{
					counts[i]++;
				}
			}
		}
		int maxPos = 0;
		for (int i = 0; i < size; i++)
			if (counts[maxPos] < counts[i])
				maxPos = i;
		mode = list[maxPos];
	}

	public void displayStats()
	{
		System.out.println(Arrays.toString(list));
		System.out.println();
		System.out.println("Mean:    " + mean);
		System.out.println("Median:  " + median);
		System.out.println("Mode:    " + mode);
	}

}

