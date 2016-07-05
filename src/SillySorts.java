import java.util.Random;
import java.util.Arrays;
public class SillySorts<T extends Comparable>
{
        public static void main(String...args)
        {
                SillySorts<Integer> s = new SillySorts<>();
                int length = 10;
                if (args.length > 0)
                        length = Integer.parseInt(args[0]);
                Integer[] list = new Integer[length];
                Random r = new Random();
                for (int i = 0; i < length; i++)
                        list[i] = r.nextInt(5000) - 2;
                System.out.println(Arrays.toString(list));
                s.bogo(list);
                //s.fastBogo(list);
                //s.stoogeSort(list);
                System.out.println(Arrays.toString(list));
        }
        public void bogo(T[] toSort)
        {
                while(true)
                {
                        shuffle(toSort);
                        if (isSorted(toSort))
                                return;
                }
                
        }
        public void fastBogo(T[] toSort)
        {
                for (int i = 0; i < Math.log(toSort.length); i++)
                {
                        shuffle(toSort);
                        if (isSorted(toSort))
                                return;
                }
                System.err.println("Kernel page fault: 2");
                System.exit(-1);
        }
        public void shuffle(T[] toShuffle)
        {
                for (int i = toShuffle.length -1; i > 0; i--)
                {
                        int cur = (int)(Math.random() * (i + 1));
                        T tmp = toShuffle[cur];
                        toShuffle[cur] = toShuffle[i];
                        toShuffle[i] = tmp;
                }
        }
        public boolean isSorted(T[] toCheck)
        {
                for (int i = 1; i < toCheck.length; i++)
                        if (toCheck[i-1].compareTo(toCheck[i]) > 0)
                                return false;
                return true;
        }
        public void stoogeSort (T[] toSort)
        {
                stoogeSort(toSort, 0, toSort.length-1);
        }
        public void stoogeSort (T[] toSort, int first, int last)
        {
                if (toSort[last].compareTo(toSort[first]) < 0)
                {
                        T tmp = toSort[last];
                        toSort[last] = toSort[first];
                        toSort[first] = tmp;
                }
                if ((last - first + 1) > 2)
                {
                        int split = (last - first + 1) / 3;
                        stoogeSort(toSort, first, last - split);
                        stoogeSort(toSort, first + split, last);
                        stoogeSort(toSort, first, last - split);
                }
        }
        
}
