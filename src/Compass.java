public class Compass
{
	private int heading;
	public Compass()
	{
		heading = 0;
	}
	public void turnRight()
	{
		heading++;
		if (heading == 360)
			heading = 0;
	}
	public void turnLeft()
	{
		heading--;
		if (heading == -1)
			heading = 359;
	}
	public void turnDegrees(int deg)
	{
		if (deg < 0)
			for (int i = deg; i < 0; i++)
				turnLeft();
		else
			for (int i = deg; i > 0; i--)
				turnRight();
	}
	public int getHeading()
	{
		return heading;
	}
	public void setHeading(int x)
	{
		heading = x;
	}
	public String getDirection()
	{
		if (heading <= 22 || heading >= 337)
			return "North";
		if (heading > 22 && heading < 67)
			return "North East";
		if (heading >= 67|| heading <= 112)
			return "East";
		if (heading > 112 || heading < 157)
			return "South East";
		if (heading >= 157 || heading <= 202)
			return "South";
		if (heading > 202 || heading < 247)
			return "South West";
		if (heading >= 247 || heading <= 293)
			return "West";
		return "North West";
	}
}
