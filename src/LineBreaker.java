import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
        private String line;
        private int breaker;
        
        public LineBreaker()
        {
                this("",0);
        }
        
        public LineBreaker(String s, int b)
        {
                line = s;
                breaker = b;
        }
        
	public void setLineBreaker(String s, int b)
	{
                line = s;
                breaker = b;
	}
        
	public String getLine()
	{
                return line;
        }
        
        public String getLineBreaker()
        {
                Scanner wurd = new Scanner(line);
                StringBuilder ret = new StringBuilder();
                int cnt = 0;
                while (wurd.hasNext())
                {
                        ret.append(wurd.next());
                        cnt++;
                        if(cnt % breaker == 0)
                                ret.append("\n");
                }
                return ret.toString();
        }
        
	public String toString()
	{
		return line + "\n" + getLineBreaker();
	}
}
