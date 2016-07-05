import java.awt.*;
import java.applet.*;

public class Drawin
{
        private final int x = 150;
        private final int y = 150;
        private final int r  = 100;
                
       
        public Drawin(Graphics g)
        {
                deadpool(g);
        }
        private void deadpool(Graphics g)
        {
                dpHead(g);
                dpEye(g, false);
                dpEye(g, true);
        }
        private void dpHead(Graphics g)
        {
                Expo.setColor(g, Expo.red);
                Expo.fillCircle(g, x, y, r);
        }
        private void dpEye(Graphics g, boolean l)
        {
                Expo.setColor(g, Expo.black);
                if (l)
                        Expo.fillArc(g, x-10, y, r-30, r-30, 180, 0); 
                else
                        Expo.fillArc(g, x+10, y, r-30, r-30, 0, 180);
                Expo.setColor(g, Expo.white);
                if (l)
                        Expo.fillArc(g, x-20, y, r-60, r-60, 180, 0); 
                else
                        Expo.fillArc(g, x+20, y, r-60, r-60, 0, 180); 
        }
}

