import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class BrickBreaker  extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
        private int score;
        private int lives;
        private Wall top;
        private Wall left;
        private Wall right;
        private Wall bottom;
        private ArrayList<Block> bricks;
        
	public BrickBreaker()
	{
                top = new Wall(0, -5, 800, 10);
                left = new Wall(-5, 0, 10, 640);
                right = new Wall(795, 0, 10, 640);
                bottom = new Wall(0, 610, 800, 10);
                
                keys = new boolean[2];
                
                score = 0; 
                lives = 5;
                
                ball = new Ball(400, 500);
                ball.setXSpeed(2);
                ball.setYSpeed(-2);
                
                paddle = new Paddle(400, 595, 100, 10, 5);
                
                
                
                bricks = getBricks("lvlTwo.txt");
                
                
                setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
        public void update(Graphics g)
        {
                paint(g);
        }
        
        public void paint(Graphics g)
        {
		//set up the double buffering to make the game animation nice and smooth
                Graphics2D twoDGraph = (Graphics2D)g;
                
                
		//take a snap shop of the current screen and same it as an image
                //that is the exact same width and height as the current screen
		if(back==null)
                        back = (BufferedImage)(createImage(getWidth(), getHeight()));
                
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
                
                if(lives < 1)
                {
                        ball.setXSpeed(0);
                        ball.setYSpeed(0);
                        paddle.setSpeed(0);
                        graphToBack.drawString("GAME OVER", 387, 30);
                }
                else if (bricks.isEmpty())
                {
                 ball.setXSpeed(0);
                        ball.setYSpeed(0);
                        paddle.setSpeed(0);
                        graphToBack.drawString("YOU WIN", 387, 30);
                        
                }

                
		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
                for (Block x : bricks)
                {
                        x.draw(graphToBack);
                }
                graphToBack.setColor(Color.white);                
                graphToBack.drawString(score + ":" + lives, 387, 15);
                

                
                if (ball.didCollide(left) || ball.didCollide(right))
                {
                        ball.setXSpeed(-ball.getXSpeed());
                }
                
                if(ball.didCollide(top))
		{
                        ball.setYSpeed(-ball.getYSpeed());
		}
                
                if (ball.didCollide(bottom))
                {
                        ball.draw(graphToBack, Color.white);
                        ball.setXSpeed(2);
                        ball.setYSpeed(2);
                        ball.setX(400);
                        ball.setY(500);
                        lives--;
                        ball.setYSpeed(-ball.getYSpeed());
                }
                
                
                //see if the ball hits the paddle
                if (ball.didCollide(paddle))
                        ball.setYSpeed(-ball.getYSpeed());

                //brick collision 
		for (Block x : bricks)
                {
                        if (x.didCollide(ball))
                        {
                                score++;
                                x.draw(graphToBack, Color.white);
                                bricks.remove(x);
                                if (ball.didCollideTop(x) || ball.didCollideBottom(x))
                                        ball.setYSpeed(-ball.getYSpeed());
                                else
                                        ball.setXSpeed(-ball.getXSpeed());
                        }
                }
		//see if the paddles need to be moved
                graphToBack.setColor(Color.black);                
                graphToBack.drawString(score + ":" + lives, 387, 15);
                

                if(keys[0])		
                        paddle.moveLeftAndDraw(graphToBack);
                if(keys[1])
                        paddle.moveRightAndDraw(graphToBack);
                
                
                twoDGraph.drawImage(back, null, 0, 0);
	}
        
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_LEFT : keys[0]=true; break;
			case KeyEvent.VK_RIGHT : keys[1]=true; break;
                }
	}

	public void keyReleased(KeyEvent e)
	{
                switch(e.getKeyCode())
		{
			case KeyEvent.VK_LEFT : keys[0]=false; break;
			case KeyEvent.VK_RIGHT : keys[1]=false; break;
                }
	}

	public ArrayList<Block> getBricks(String fileName)
        {
                try 
                {
                        Scanner in = new Scanner(new File(fileName));
                        ArrayList<String> lines = new ArrayList<>();
                        while (in.hasNextLine())
                        {
                                lines.add(in.nextLine());
                        }
                        in.close();
                        char[][] chars = new char[lines.size()][];
                        for (int i = 0; i < lines.size(); i++)
                        {
                                chars[i] = lines.get(i).toCharArray();
                        }
                        ArrayList<Block> ret = new ArrayList<>();
                        int width = 80, height = 40;
                        for (int r = 0; r < chars.length; r++)
                        {
                                for (int c = 0; c < chars[r].length; c++)
                                {
                                        if (chars[r][c] != ' ')
                                        {
                                                Color randCol = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
                                                int x = c * width;
                                                int y = r * height;
                                                ret.add(new Block(x, y, width, height, randCol));
                                        }
                                }
                        }
                        return ret;
                }
                catch (FileNotFoundException e)
                {
                        e.printStackTrace();
                        return null;
                }
        }
        
        public void keyTyped(KeyEvent e){}
	
        public void run()
        {
                try
                {
                        while(true)
                        {
                                Thread.currentThread().sleep(8);
                                repaint();
                        }
                }
                catch(Exception e)
                {
                }
  	}	
}
