import java.util.Scanner;
public class Transpose
{
	public static void main(String[] argsv)
	{
		Scanner in = new Scanner(System.in);
		int matrix[][] = new int[5][5];
		fill(matrix);
		print(matrix);
	}
	public static void fill(int[][] m)
	{
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
			{
				m[i][j] = (int)(Math.random()*200) - 100;
			}
		}
	}
	public static void print(int[][] m )
	{
		System.out.println("Matrix: ");
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
				System.out.printf("%4d", m[i][j]);
			System.out.println();
		}
		
		int [][] n = transpose(m); 
	
		System.out.println("Transposed: ");
		for (int i = 0; i < n.length; i++)
		{
			for (int j = 0; j < n[i].length; j++)
				System.out.printf("%4d" , n[i][j]);
			System.out.println();
		}
		
	       System.out.println();		
		
	}
	public static int[][] transpose(int[][] m)
	{
		int ret[][] = new int [m[0].length][m.length];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				ret[j][i] = m[i][j];
		return ret;
	}
}
