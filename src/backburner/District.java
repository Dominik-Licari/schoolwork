import java.util.ArrayList;
public class District
{
	public ArrayList<School> schools;
	private String name;
	public District(String name)
	{
		schools = new ArrayList<School>();
		this.name = name;
	}
	public void addSchool(School schoolOfHardKnocks)
	{
		schools.add(schoolOfHardKnocks);
	}
}
