public class Highschool extends School
{
	public Highschool(String name)
	{
		super(name);
	}
	@Override
	public void graduate()
	{
		super.graduate();
		for (Student cur : super.students)
			if (cur.getYear() > 12)
				super.students.remove(cur);
		
	}
	
}
