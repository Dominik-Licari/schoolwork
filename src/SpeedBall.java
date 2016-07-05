import java.awt.Color;
import java.awt.Graphics;

public class SpeedBall extends Ball
{
        public SpeedBall(int x, int y)
        {
                super(x, y);
        }
        public SpeedBall(int x, int y, int w, int h)
        {
                super(x, y, w, h);
        
        }
        public SpeedBall(int x, int y, int w, int h, Color c)
        {
                super(x, y, w, h, c);
        
        }
        public SpeedBall(int x, int y, int w, int h, Color c, int xS, int yS)
        {
                super(x, y, w, h, c, xS, yS);
        }

        public boolean didCollideLeft(Object obj)
        {
                if (super.didCollideLeft(obj))
                {
                        setXSpeed(getXSpeed()+1);
                        setYSpeed(getYSpeed()+1);
                }
                return super.didCollideLeft(obj);
        }
        public boolean didCollideRight(Object obj)
        {
                if (super.didCollideRight(obj))
                {
                       setXSpeed(getXSpeed()+1);
                       setYSpeed(getYSpeed()+1);
                }
                return super.didCollideRight(obj);
       
        }
        public boolean didCollideTop(Object obj)
        {
                if (super.didCollideTop(obj))
                {
                        setXSpeed(getXSpeed()+1);
                        setYSpeed(getYSpeed()+1);
                }
                return super.didCollideTop(obj);
        
                
        }
        public boolean didCollideBottom(Object obj)
        {
                if (super.didCollideBottom(obj))
                {
                        setXSpeed(getXSpeed()+1);
                        setYSpeed(getYSpeed()+1);
                }
                return super.didCollideBottom(obj);
                
               
        }

        public String toString()
        {
                return super.toString() + " " + getXSpeed() + " " + getYSpeed();
        }
}
