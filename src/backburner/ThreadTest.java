public class ThreadTest implements Runnable
{
	public static void main()
	{
		double x = 0;
		for (int i = 0; i < 5; i++)
			x += (new Thread(new ThreadTest())).start();
	}
	public  int run()
	{
		return 4; //Math.rand();
	}
}
