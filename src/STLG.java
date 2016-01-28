import java.util.Scanner;
public class STLG
{
	public static void main(String[] argsv)
	{
		Scanner in = new Scanner(System.in);
	        int matrix[][][] = new int[3][40][40];
		fill(matrix[0]);
		fill(matrix[1]);
		filla(matrix);
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
	public static void filla(int[][][] m)
	{
		for (int i = 0; i < m[0].length; i++)
		{
			for (int j = 0; j < m[0][i].length; j++)
			{
				m[2][i][j] = (m[0][i][j] > m[1][i][j]) ? m[0][i][j] : m[1][i][j];
			}
		}
	}
	public static void print(int[][][] m )
	{
		System.out.println("Matrix: eins");
		for (int [] x : m[0])
		{
			for (int y : x)
				System.out.print(y + " ");
			System.out.println();
		}
		System.out.println("Matrix: zwei");
		for (int [] x : m[1])
		{
			for (int y : x)
				System.out.print(y + " ");
			System.out.println();
		}
		System.out.println("Matrix: da biggist");
		for (int [] x : m[2])
		{
			for (int y : x)
				System.out.print(y + " ");
			System.out.println();
		}
		
	}
}
