import java.awt.*;
import java.applet.*;
public class Yay extends Applet
{
        public void paint(Graphics g)
        {
                
                g.setColor(Color.red);
                g.drawOval(10,10,20,20);
                g.drawOval(60,10,20,20);
                g.setColor(Color.green);
                g.drawArc(10,50,75,20,0,-180);
                
        }
}

