
//Name -
//Date -
//Class -
//Lab  - 

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
import java.awt.Dimension;
public class PaddleTestTwo extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
        private Paddle rightPaddle;
	private boolean[] keys;		//keeps track of what keys are pressed

	public PaddleTestTwo()
	{
		//set up all game variables
                //this.setPreferredSize(new Dimension(600, 500));

		//instantiate a Ball
		ball = new Ball();
		
		
		//instantiate a left Paddle
		leftPaddle = new Paddle(20, 20, 10, 50, 5);
		
		
		
		//instantiate a right Paddle
		rightPaddle = new Paddle(630, 20, 10, 50, 5);
		

		keys = new boolean[5];


		//set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics g)
	{
		ball.moveAndDraw(g);
		leftPaddle.draw(g);
                rightPaddle.draw(g);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if(keys[0] == true)
		{
                        leftPaddle.moveUpAndDraw(g);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(g);
		}
		if(keys[2] == true)
		{
                        rightPaddle.moveUpAndDraw(g);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(g);
		}
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

	public void keyTyped(KeyEvent e)
	{
		//no code needed here
	}
	
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
