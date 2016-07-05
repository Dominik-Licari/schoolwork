public class Student extends Person
{
	private int year;
	private double GPA;
	private int id;
	private double grades[];
	public Student (String name, String birthDate, int grade, int id)
	{
		super(name, birthDate);
		this.year = grade;
		this.id = id;
		grades = new double[4];
	}
	public void graduate()
	{
		year++;
	}
	public double getGPA()
	{
		return GPA;
	}
	private void updateGPA()
	{
		double x = 0;
		for (int i = 0; i < grades.length; i++)
			x+= (grades[i] / 100);
		GPA = x;
	}
	public int getYear()
	{
		return year;
	}
	public void setGrade(int period, double grade)
	{
		grades[period] = grade;
		updateGPA();
	}
	     
}
