import java.awt.Color;
import java.awt.Graphics;
public class Wall extends Block
{

        public Wall(int x, int y)
        {
                super(x,y);
        }
        public Wall(int x, int y, int w, int h)
        {
                super(x,y,w,h);
        }
        @Override
        public void draw(Graphics g)
        {
                return;
        }

        @Override
        public void draw(Graphics g, Color c)
        {
                return;
        }
}
