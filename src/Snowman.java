import java.awt.*;
import java.applet.*;
public class Snowman extends Applet
{
        public void paint(Graphics g)
        {
                final int MID = 170;
                final int TOP = 50;
                setBackground(Color.cyan);
                
                g.drawString("Dominik Pasquale Giordano Licari", 10, 10);
                
                g.setColor(Color.blue);
                g.fillRect(0,175,300,50);
                
                g.setColor(Color.yellow);
                g.fillOval(260,-40,80,80);
                
                g.setColor(Color.white);
                g.fillOval(MID - 20, TOP, 40, 40);
                g.fillOval(MID - 35, TOP + 35, 70, 50);
                g.fillOval(MID - 50, TOP + 80, 100, 60);
                
                g.setColor(Color.red);
                g.fillOval(MID, TOP + 45, 5, 5);
                g.fillOval(MID, TOP + 55, 5, 5);
               

                g.setColor(Color.black);
                g.fillOval(MID - 10, TOP + 10, 5, 5);
                g.fillOval(MID + 10, TOP + 10, 5, 5);
                
                g.drawArc(MID - 10, TOP + 20, 20, 10, -190, -160);
                
                g.drawLine(MID - 25, TOP + 60, MID - 50, TOP + 40);
                g.drawLine(MID + 25, TOP + 60, MID + 55, TOP + 60);
                
                g.drawLine(MID - 20, TOP + 5, MID + 20, TOP + 5);
                g.fillRect(MID - 15, TOP - 20, 30, 25);
        }
}

