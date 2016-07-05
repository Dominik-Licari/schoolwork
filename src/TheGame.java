import javax.swing.JFrame;
import java.awt.Component;
import java.io.*;
public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 640;

	public TheGame()
	{
		super("Breakout");
		setSize(WIDTH,HEIGHT);

		Breakout game = new Breakout();

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
                try
                {
                        System.setOut(new PrintStream("/dev/null"));
                        System.setErr(new PrintStream("/dev/null"));
		}
                catch (FileNotFoundException e)
                {}
                TheGame run = new TheGame();
               
        }
}
