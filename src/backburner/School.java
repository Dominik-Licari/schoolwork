import java.util.ArrayList;
public class School
{
	public ArrayList<Student> students;
	private String name;
	public School(String name)
	{
		students = new ArrayList<Student>();
		this.name = name;
	}
	public void addStudent(Student bob)
	{
		students.add(bob);
	}
	public void graduate()
	{
		for (int i = 0; i < students.size(); i++)
		{
			students.get(i).graduate();
		}
	}
	public Student bestGPA()
	{
		double best = 0.0;
		Student ret = null;
		for (Student cur : students)
		{
			if (best < cur.getGPA())
			{
				best = cur.getGPA();
				ret = cur;
			}
		}
		return ret;
	}
	
}
