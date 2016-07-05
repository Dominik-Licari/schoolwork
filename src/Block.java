import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
public class Block implements Locatable
{
        private int xPos;
        private int yPos;
        private int width;
        private int height;
        private Color color;
                
        public Block()
        {
                xPos = 100;
                yPos = 150;
                width = 10;
                height = 10;
                color = Color.black;
                
        }
        public Block(int x, int y)
        {
                xPos = x;
                yPos = y;
                width = 10;
                height = 10;
                color = Color.black;
                
        }
        public Block(int x, int y, int w, int h)
        {
                xPos = x;
                yPos = y;
                width = w;
                height = h;
                color = Color.black;
              
        }
        public Block(int x, int y, int w, int h, Color c)
        {
                xPos = x;
                yPos = y;
                width = w;
                height = h;
                color = c;
               
        }
        public void draw(Graphics g)
        {
                g.setColor(color);
                g.fillRect(xPos, yPos, width, height);
        }
        public void draw(Graphics g, Color c)
        {
                g.setColor(c);
                g.fillRect(xPos, yPos, width, height);
        }
        
        public boolean equals(Object o)
        {
                if (this == o)
                //if (xPos == o.getX() && yPos == o.getY() && width == o.getWidth() && height == o.getHeight() && color == o.getColor())
                        return true;
                else 
                        return false;
        }
        
        public String toString()
        {
                return xPos + " " + yPos + " " + width + " " + height + " " + color;
        }
        public void setPos(int x, int y)
        {
                xPos = x; 
                yPos = y;
        }        
        public void setX(int x)
        {
                xPos = x;
        }
        public void setY(int y)
        {
                yPos = y;
        }
        public Rectangle getBounds()
        {
                return new Rectangle(xPos, yPos, width, height);
        }
        public int getX()
        {
                return xPos;
        }
        public int getY()
        {
                return yPos;
        }
        public int getWidth()
        {
                return width;
        }
        public int getHeight()
        {
                return height;
        }
        public Color getColor()
        {
                return color;
        }
        
        public boolean didCollide(Block o)
        {
                return getBounds().intersects(o.getBounds());
        }
}
