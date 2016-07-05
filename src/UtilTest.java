public class UtilTest
{
        public static void main(String... args)
        {
                int    i = Util.readInt();
                System.out.println("Da num: " + i);
                Util.blanks(2);
                double d  = Util.readDouble();
                System.out.println("Da num: " + d);
                Util.blanks(2);
                String s = Util.readString();
                System.out.println("Da wurd: " + s);
                Util.blanks(2);
        }
}
