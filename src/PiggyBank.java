public class PiggyBank
{
	private int q;
	private int d;
	private int n;
	private int p;
	
	public PiggyBank()
	{
		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;
	}
	public void insertQuarter()
	{
		q++;
	}
	public void insertDime()
	{
		d++;
	}
	public void insertNickel()
	{
		n++;
	}
	public void insertPenny()
	{
		p++;
	}
	public int breakBank()
	{
		return (p + (5 * n) + (10 * d) + (25 * q));
	}
}
