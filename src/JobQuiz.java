import DomTools.Pair;
import java.util.Scanner;
public class JobQuiz
{
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] argsv)
	{
		String[] jobs = {"Help desk", "Sysadmin", "Sr. Game Design", "Entry level Software Dev", "Kernel Dev"};
		String[] descriptions = {"Your job is to help users with hardware and software issues. Your salary is $46K.",
					 "Your job is to keep the servers running, upgrade them, and ensure everything is running smoothly. You will need a Masters degree, 5+ years of \nexperience, and multiple certifications including the A+ and Server+. Your salary is $74K",
					 "Your job is to manage the team designing the game. You ensure the game is fun and that the teams are working together. You need a Bachelors \ndegree and 5+ years of experience. You need to know  Your salary is $100K.",
					 "Your job is to write the backend for some site or server. You will want a Bachelors degree, and your salary is $52K",
					 "Your job is to work on the Linux kernel. You need 5+ years of experince, as many certs as you can get, and at least a Bachelors \n Your salary is $95K."};
		int[] scores = new int[5];
		System.out.println("To answer the questions just type in 'y' or 'n'.");
		String [] questions = {"Are you willing to wait for expireince?", 
				       "Do you need a salary greater than $70K?", 
				       "Are you good with people?",
				       "Do you want to actualy be writing code?",
				       "Do you know a large amount about hardware?",
				       "Are you still in college?",
				       "Do you know anything about Linux?",
				       "Are you creative?",
				       "Are you detail oriented?",
				       "Do you like helping people?"};
		String [][] posJobs = {{jobs[1], jobs[4], jobs[3]}, {jobs[1], jobs[4], jobs[3]}, {jobs[0], jobs[2]},{jobs[2], jobs[3], jobs[4]},{jobs[0], jobs[1]}, {jobs[0], jobs[3]},{jobs[1], jobs[4]},{jobs[2]},{jobs[3], jobs[4], jobs[2]},{jobs[0]}};
		String [][] negJobs = {{jobs[2], jobs[0]}, {jobs[2], jobs[4]}, {jobs[3], jobs[1], jobs[4]}, {jobs[0], jobs[1]}, {jobs[4], jobs[2], jobs[3]}, {jobs[1], jobs[2], jobs[4]}, {jobs[3], jobs[2], jobs[4]}, {jobs[0], jobs[3], jobs[1], jobs[4]}, {jobs[1], jobs[0]}, {jobs[2], jobs[3], jobs[2], jobs[4]}}; //move from array of pairs, left is pos, right is neg
		
		for (int i = 0; i < 10; i++)
		{
			Pair<String[], String[]> changes= ask(questions[i], new Pair<String[], String[]>(posJobs[i], negJobs[i]));
			for (String x : changes.x)
			{
				for (int j = 0; j < 5; j++)
				{
					if (x.equals(jobs[j]))
						scores[j]++;
				}
			}
			for (String x : changes.y)
			{
				for (int j = 0; j < 5; j++)
				{
					if (x.equals(jobs[j]))
						scores[j]--;
				}
			}
		}
		
		int max = 0;
		for (int i = 1; i < 5; i++)
			if (scores[i] > scores[max])
				max = i;
		
		System.out.println("Your best match was " + jobs[max] + ".");
		System.out.println(descriptions[max]);
		in.close();
       
	}
	public static Pair<String[],String[]> ask(String question, Pair<String[], String[]> affectedJobs)
	{
		System.out.println(question);
		String answer = in.nextLine();
		if (answer.equalsIgnoreCase("y"))
			return affectedJobs;
		return affectedJobs.flip();
	}
}
