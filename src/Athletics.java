public class Athletics 
{
        public static void test()
        {
                Football f = new Football("Lions", 20, -2, 22, 15, 0);
                Baseball b = new Baseball("Cubs",  200, 2, 198, 2, 0, 5000);
                System.out.println(f);
                System.out.println();
                System.out.println(b);
                System.out.println("\n(The cubs only won those 'cuz they went against the Lions)");
                
        }
        public static void main(String... AHRGS)
        {
                test();
        }
}
