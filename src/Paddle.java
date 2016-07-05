import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
        //instance variables
        private int speed;
        
        public Paddle()
        {
                super(10,10);
                speed = 5;
        }
        public Paddle(int x, int y)
        {
                super(x, y);
                speed = 5;
        }
        public Paddle(int x, int y, int s)
        {
                super(x, y);
                speed = s;
        }
        public Paddle(int x, int y, int w, int h, int s)
        {
                super(x, y, w, h);
                speed = s;
        }
        public Paddle(int x, int y, int w, int h, Color c, int s)
        {
                super(x, y, w, h, c);
                speed = s;
        }
        
        public boolean equals(Object o)
        {
                return this == o;
        }
        
        public void moveUpAndDraw(Graphics g)
        {
                
                draw(g, Color.white);       
                setY(getY()-speed);
                draw(g);
        }
        
        public void moveDownAndDraw(Graphics g)
        {
                draw(g, Color.white);       
                setY(getY()+speed);
                draw(g);
        }
        
        public void moveLeftAndDraw(Graphics g)
        {
                
                draw(g, Color.white);       
                setX(getX()-speed);
                draw(g);
        }
        
        public void moveRightAndDraw(Graphics g)
        {
                draw(g, Color.white);       
                setX(getX()+speed);
                draw(g);
        }
                
        
        //add get methods
        public int getSpeed()
        {
                return speed;
        }
        
        public void setSpeed(int s)
        {
                speed = s;
        }
        
        //add a toString() method
        public String toString()
        {
                return super.toString() + " " + speed;
        }
}
