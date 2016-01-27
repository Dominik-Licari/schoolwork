import java.util.Scanner;
public class LTH
{
	public static void main(String[] argsv)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
	        int matrix[][] = new int[in.nextInt()][in.nextInt()];
		fill(matrix);
		print(matrix);
	}
	public static void fill(int[][] m)
	{
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
			{
				m[i][j] = (int)(Math.random()*200) + 1;
			}
		}
	}
	public static void print(int[][] m )
	{
		System.out.println("Matrix: ");
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		System.out.println("# less than 100");
		System.out.printf("%-10s%-10s%n", "row", "column");
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
				if (m[i][j] < 100)
					System.out.printf("%-10d%-10d%n", i, j);

		}
		
	}
}
