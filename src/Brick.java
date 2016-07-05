import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class Brick extends Block
{
        private Image img;
        private SpriteColor c;
        
        public Brick()
        {
                super();
                c = SpriteColor.getRandom();
                try 
                {
                        img = ImageIO.read(new File("brick.png"));
                        BufferedImage tmp = (BufferedImage)img;
                        switch (c)
                        {
                        case RED: 
                                img = tmp.getSubimage(0, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case BLUE:
                                img = tmp.getSubimage(tmp.getWidth()/3, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case GREY:
                                img = tmp.getSubimage((tmp.getWidth()/3) * 2, 0, tmp.getHeight(), tmp.getWidth()/3);
                        }
                        img = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                }
        }
        public Brick(int x, int y)
        {
                super(x, y);
                c = SpriteColor.getRandom();
                try 
                {
                        img = ImageIO.read(new File("brick.png"));
                        BufferedImage tmp = (BufferedImage)img;
                        switch (c)
                        {
                        case RED: 
                                img = tmp.getSubimage(0, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case BLUE:
                                img = tmp.getSubimage(tmp.getWidth()/3, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case GREY:
                                img = tmp.getSubimage((tmp.getWidth()/3) * 2, 0, tmp.getHeight(), tmp.getWidth()/3);
                        }
                        img = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                }        
        }
        public Brick(int x, int y, int w, int h)
        {
                super(x, y, w, h);
                c = SpriteColor.getRandom();
                try 
                {
                        img = ImageIO.read(new File("brick.png"));
                        BufferedImage tmp = (BufferedImage)img;
                        switch (c)
                        {
                        case RED: 
                                img = tmp.getSubimage(0, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case BLUE:
                                img = tmp.getSubimage(tmp.getWidth()/3, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case GREY:
                                img = tmp.getSubimage((tmp.getWidth()/3) * 2, 0, tmp.getHeight(), tmp.getWidth()/3);
                        }
                        img = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                }
        }
        public Brick(int x, int y, int w, int h, SpriteColor col)
        {
                super(x, y, w, h);
                c = col;               
                try 
                {
                        img = ImageIO.read(new File("brick.png"));
                        BufferedImage tmp = (BufferedImage)img;
                        switch (c)
                        {
                        case RED: 
                                img = tmp.getSubimage(0, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case BLUE:
                                img = tmp.getSubimage(tmp.getWidth()/3, 0, tmp.getHeight(), tmp.getWidth()/3);
                                break;
                        case GREY:
                                img = tmp.getSubimage((tmp.getWidth()/3) * 2, 0, tmp.getHeight(), tmp.getWidth()/3);
                        }
                        img = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);}
                catch (IOException e)
                {
                        e.printStackTrace();
                }
        }
        @Override
        public void draw(Graphics g)
        {
                g.drawImage(img, getX(), getY(), null);
        } 
        
        
}
