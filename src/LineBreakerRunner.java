import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;
public class LineBreakerRunner
{
   public static void main(String args[])
   {
           try
           {
                   Scanner in = new Scanner(new File("Effort"));
                   LineBreaker erste = new LineBreaker(in.nextLine(), in.nextInt());
                   in.nextLine();
                   in.nextLine();
                   LineBreaker zweite = new LineBreaker(in.nextLine(), in.nextInt());
                   in.nextLine(); 
                   in.nextLine();
                   LineBreaker dritte = new LineBreaker(in.nextLine(), in.nextInt());
                   
                   System.out.println(erste);
                   System.out.println(zweite);
                   System.out.println(dritte);
           }
           catch(FileNotFoundException e)
           {
                    System.out.println("Was ist \"Effort?\"");
           }
   }
}
