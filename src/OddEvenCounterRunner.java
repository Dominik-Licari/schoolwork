import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
        public static void main(String args[])
        {
                Scanner dat = new Scanner("9 10 5 20\n11 22 33 44 55 66 77\n3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6\n2 4 6 8 2 4 6\n1 3 5 7 9 1 3 5\n");
                OddEvenCounter eins = new OddEvenCounter(dat.nextLine());
                OddEvenCounter zwei = new OddEvenCounter(dat.nextLine());
                OddEvenCounter drei = new OddEvenCounter(dat.nextLine());
                OddEvenCounter vier = new OddEvenCounter(dat.nextLine());
                OddEvenCounter funf = new OddEvenCounter(dat.nextLine());
                out.println(eins);
                out.println();
                out.println();
                out.println(zwei);
                out.println();
                out.println();
                out.println(drei);
                out.println();
                out.println();
                out.println(vier);
                out.println();
                out.println();
                out.println(funf);
        }
}
