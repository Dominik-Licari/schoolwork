import java.util.Scanner;
public class SUM
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
				m[i][j] = (int)(Math.random()*10);
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
			System.out.println("| " + sum(m[i]));
		}
		int [][] n = new int[m[0].length][m.length];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				n[j][i] = m[i][j];
		for (int i = 0; i < n.length*2; i++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < n.length; i++)
		       System.out.print(sum(n[i]) + " ");
	       System.out.println();		
		
	}
	public static int sum(int[] m)
	{
		int ret = 0;
		for (int x : m)
			ret+=x;
		return ret;
	}
}
