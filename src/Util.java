import java.util.Scanner;
public class Util
{
        private static final Scanner in = new Scanner(System.in);
               
        public static int readInt(String p)
        {
                System.out.print(p);
                int x = in.nextInt();
                in.nextLine();
                return x;
        }
        public static double readDouble(String p)
        {
                System.out.print(p);
                double x = in.nextDouble();
                in.nextLine();
                return x;
        }
        public static String readString(String p)
        {
                System.out.print(p);
                return in.next();
        }
        public static int readInt()
        {
                return readInt("Gimmie da nummer! ");
        }
        public static double readDouble()
        {
                return readDouble("Gimmie da nummer! ");
        }
        public static String readString()
        {
                return readString("Gimmie da wurd! ");
        }
        
        public static void blanks(int n)
        {
                for (; n > 0; n--)
                {
                        System.out.println();
                }
        }
}
