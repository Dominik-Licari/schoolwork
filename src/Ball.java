import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
        
	//add the other Ball constructors
	public Ball(int x, int y)
        {
                super(x, y);
                xSpeed = 3;
                ySpeed = 1;
        }
        public Ball(int x, int y, int w, int h)
        {
                super(x, y, w, h);
                xSpeed = 3;
                ySpeed = 1;
        }
        public Ball(int x, int y, int w, int h, Color c)
        {
                super(x, y, w, h, c);
                xSpeed = 3;
                ySpeed = 1;
        }
        public Ball(int x, int y, int w, int h, Color c, int xS, int yS)
        {
                super(x, y, w, h);
                xSpeed = xS;
                ySpeed = yS;
        }

        public void setXSpeed(int xS)
        {
                xSpeed = xS;
        }
        public void setYSpeed(int yS)
        {
                ySpeed = yS;
        }
        
        
        public void moveAndDraw(Graphics g)
        {
                //draw a white ball at old ball location
                draw(g, Color.white);       
                setX(getX()+xSpeed);
                //setY
                setY(getY()+ySpeed);
                //draw the ball at its new location
                draw(g);
        }
        
        
        
	public boolean equals(Object obj)
	{
                if (this == obj)
                        return true;
		return false;
	}   

        
        public int getXSpeed()
        {
                return xSpeed;
        }
        public int getYSpeed()
        {
                return ySpeed;
        }
        
        public boolean didCollideLeft(Object obj)
        {
                try
                {
                        Block o = (Block)obj;
                        return (getX() <= o.getX() + o.getWidth() - Math.abs(xSpeed)) &&
                                (getY() >= o.getY() && getY() <= o.getY() + o.getHeight());
                }
                catch (Exception e)
                {
                        return false;
                }
        }
        public boolean didCollideRight(Object obj)
        {
                try
                {
                        Block o = (Block)obj;
                        return (getX() >= o.getX() - o.getWidth() + Math.abs(xSpeed)) &&
                                (getY() >= o.getY() && getY() <= o.getY() + o.getHeight());
                }
                catch (Exception e)
                {
                        return false;
                }
        }
        public boolean didCollideTop(Object obj)
        {
                try
                {
                        Block o = (Block)obj;
                        return (getX() >= o.getX() && getX() <= o.getX() + o.getWidth()) &&
                                (getY() <= o.getY() + o.getHeight() + Math.abs(ySpeed) && getY() >= o.getY()); 
                }
                catch (Exception e)
                {
                        return false;
                }
        }
        public boolean didCollideBottom(Object obj)
        {
                try
                {
                        Block o = (Block)obj;
                        return (getX() >= o.getX() && getX() <= o.getX() + o.getWidth()) &&
                                (getY() <= o.getY() + o.getHeight() - Math.abs(ySpeed) && getY() >= o.getY()); 
                }
                catch (Exception e)
                {
                        return false;
                }
        }

        public String toString()
        {
                return super.toString() + " " + xSpeed + " " + ySpeed;
        }
}
