import static java.lang.System.*;

public class StringChecker
{
	private String word;
        
	public StringChecker()
	{
                word = "";
	}
        
	public StringChecker(String s)
	{
                word = s;
        }

        public void setString(String s)
        {
                word=s;
        }
        
	public boolean findLetter(char c)
	{
                return word.contains(c + "");
        }
        
	public boolean findSubString(String s)
	{
		return word.contains(s);
	}
        
 	public String toString()
 	{
 		return word + "\n\n";
	}
}
