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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle lPaddle;
	private Paddle rPaddle;
	private boolean[] keys;
	private BufferedImage back;
        
        private int lScore;
        private int rScore;

        private Wall top;
        private Wall left;
        private Wall right;
        private Wall bottom;
        
	public Pong()
	{
                top = new Wall(0, -5, 800, 10);
                left = new Wall(-5, 0, 10, 640);
                right = new Wall(795, 0, 10, 640);
                bottom = new Wall(0, 605, 800, 10);
                
                keys = new boolean[4];
                
                lScore = 0;
                rScore = 0; 
                ball = new Ball(400, 320);
                ball.setXSpeed(-5);
                
                lPaddle = new Paddle(20, 20, 10, 100, 5);
                rPaddle = new Paddle(775, 20, 10, 100, 5);
                
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
                
                
		ball.moveAndDraw(graphToBack);
		lPaddle.draw(graphToBack);
		rPaddle.draw(graphToBack);
                graphToBack.setColor(Color.white);
                graphToBack.drawString(lScore + ":" + rScore, 387, 15);
                graphToBack.setColor(Color.black);
                
                //see if ball hits left wall or right wall
		//if (ball.getX() <= 20) 
                if (ball.didCollideLeft(left))
                {
                        ball.draw(graphToBack, Color.white);
                        ball.setX(200);
                        ball.setY(200);
                        rScore++;
			ball.setXSpeed(-ball.getXSpeed());
                }
                else if (ball.didCollideRight(right))
                {
                        ball.draw(graphToBack, Color.white);
                        ball.setX(200);
                        ball.setY(200);
                        lScore++;
			ball.setXSpeed(-ball.getXSpeed());
                }
                 graphToBack.drawString(lScore + ":" + rScore, 387, 15);
               		
		//see if the ball hits the top or bottom wall 
                
                if(ball.didCollideTop(top)|| ball.didCollideBottom(bottom))
		{
                        ball.setYSpeed(-ball.getYSpeed());
		}
                
                /* Without collidable
		//see if the ball hits the left paddle
                {
                        int ballX = ball.getX();
                        int ballY = ball.getY();
                        int ballHeight = ball.getHeight();
                        int ballXSpeed = ball.getXSpeed();
                        int paddleX = lPaddle.getX();
                        int paddleY = lPaddle.getY();
                        int paddleHeight = lPaddle.getHeight();
                        int paddleWidth = lPaddle.getWidth();
                        
                        if ((ballX <= paddleX + paddleWidth + Math.abs(ballXSpeed)) &&
                            (ballY >= paddleY && ballY <= paddleY + paddleHeight || 
                             ballY + ballHeight >= paddleY &&
                             ballY + ballHeight < paddleY + paddleHeight))
                        {
                            if (ballX <= paddleX + paddleWidth - Math.abs(ballXSpeed))
                                    ball.setYSpeed(-ball.getYSpeed());
                            else
                                    ball.setXSpeed(-ball.getXSpeed());
                                        
                        }
                }
		
		
		//see if the ball hits the right paddle
		
		{
                        int ballX = ball.getX();
                        int ballY = ball.getY();
                        int ballHeight = ball.getHeight();
                        int ballXSpeed = ball.getXSpeed();
                        int paddleX = rPaddle.getX();
                        int paddleY = rPaddle.getY();
                        int paddleHeight = rPaddle.getHeight();
                        int paddleWidth = rPaddle.getWidth();
                        
                        if ((ballX >= paddleX - paddleWidth + Math.abs(ballXSpeed)) &&
                            (ballY >= paddleY && ballY <= paddleY+ paddleHeight || 
                             ballY + ballHeight >= paddleY &&
                             ballY + ballHeight < paddleY + paddleHeight))
                        {
                            if (ballX >= paddleX - paddleWidth - Math.abs(ballXSpeed))
                                    ball.setXSpeed(-ball.getXSpeed());
                            else
                                    ball.setYSpeed(-ball.getYSpeed());
                                        
                        }
                }
		*/
                //With Collidable
                //see if the ball hits the left paddle
                if (ball.didCollideLeft(lPaddle))
                        ball.setXSpeed(-ball.getXSpeed());
                if(ball.didCollideTop(lPaddle)) //|| ball.didCollideBottom(lPaddle))
                        ball.setYSpeed(-ball.getYSpeed());
		
                
                //see if the ball hits the right paddle
                if (ball.didCollideRight(rPaddle))
                        ball.setXSpeed(-ball.getXSpeed());
                if(ball.didCollideTop(rPaddle) || ball.didCollideBottom(rPaddle))
                        ball.setYSpeed(-ball.getYSpeed());
                 
		


		//see if the paddles need to be moved


                if(keys[0])		
                        lPaddle.moveUpAndDraw(graphToBack);
                if(keys[1] == true)
                        lPaddle.moveDownAndDraw(graphToBack);
                if(keys[2] == true)
                        rPaddle.moveUpAndDraw(graphToBack);
                if(keys[3] == true)
                        rPaddle.moveDownAndDraw(graphToBack);
                
                twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'K' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'K' : keys[3]=false; break;
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
