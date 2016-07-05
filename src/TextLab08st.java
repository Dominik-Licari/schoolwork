// TextLab08st.java
// The "Text File" Program
// This is the student, starting version of Text Lab 08.


import java.io.*;
import java.util.*;

public class TextLab08st
{
	private static ArrayList<String> names;
	private static int fileSize;

	public static void main (String args[]) throws IOException
	{
		System.out.println("\nTextLab08\n");
		names = new ArrayList<String>();
		readFile("Names1.txt");
		displayArray();
		writeFile("Names2.txt");
	}

	public static void readFile(String fileName) throws IOException
	{
                Scanner in = new Scanner(new File(fileName));
                for (int i = 0; in.hasNextLine(); i++)
                        names.add(in.nextLine());
                in.close();
	}

	public static void displayArray()
	{
		System.out.println("Names Array Contents\n");
                for (String x : names)
                {                        
                        System.out.println(x);
                }
		System.out.println();
	}

	public static void writeFile(String fileName) throws IOException
	{
                PrintStream out = new PrintStream(new File(fileName));
                for (String x : names)
                {
                        out.println(x);
                }
		out.println();
                out.close();
	}

}


