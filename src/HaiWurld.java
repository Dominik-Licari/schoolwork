import java.awt.*;
import java.applet.*;
public class HaiWurld extends Applet
{
        private int y;
        private boolean runnin;
        public void init()
        {
                setVisible(true);
                setBackground(new Color(142, 142, 142));
                y = 150;
        }
        public void paint(Graphics g)
        {
                g.drawString("Hai wurld", 50, 50);
                g.setColor(Color.RED);
                g.drawRect(100, y, 50, 50);
                g.setColor(Color.BLUE);
                g.fillOval(200, y, 50, 50);
        }
        public void start()
        {
                delay(500);
                while (y > 0)
                {
                        y-=5;
                        repaint();
                        delay(100);
                }
                while (y < 200)
                {
                        y+=5;
                        repaint();
                        delay(100);
                }
        }
        public void delay(int mills)
        {
                try
                {
                        Thread.sleep(mills);
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
        }
}
