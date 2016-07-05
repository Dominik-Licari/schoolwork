public class BasketballPlayer
{
	private String name;
	private int points;
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public void made2FG(int shots)
	{
		points += 2 * shots;
	}
	public void made3FG(int shots)
	{
		points += 3 * shots;
	}
	public void madeFT(int shots)
	{
		points += shots;
	}
	public int getPoints()
	{
		return points;
	}

}
