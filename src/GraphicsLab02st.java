// GraphicsLab02st.java
// This is the student, starting version of Graphics Lab 02 which is divided into 8 cells.
// The first cell -- "Draw Red Horizontal Lines" -- is provided as an example.
// Students need to complete the other 7 cells on their own.

import java.awt.*;
import java.applet.*;

public class GraphicsLab02st extends Applet
{
        public void init()
        {
                super.init();
                setPreferredSize(new Dimension(1000, 685));
        }
	public void paint(Graphics g)
	{
		// Draw Grid
		Expo.drawLine(g,250,0,250,650);
		Expo.drawLine(g,500,0,500,650);
		Expo.drawLine(g,750,0,750,650);
		Expo.drawLine(g,0,325,1000,325);

		int x1, y1, x2, y2, x, y, r;

		// Draw Red Horizontal Lines
		Expo.setColor(g,Expo.red);
		x1 = 0;
		y1 = 5;
		x2 = 250;
		y2 = 5;
		for (int k = 1; k <= 32; k++)
		{
		    Expo.drawLine(g,x1,y1,x2,y2);
		    y1 += 10;
		    y2 += 10;
		}


		// Draw Blue Vertical Lines

                Expo.setColor(g,Expo.blue);
		x1 = 251;
		y1 = 0;
		x2 = 251;
		y2 = 325;
		for (int k = 1; k <= 25; k++)
		{
		    Expo.drawLine(g,x1,y1,x2,y2);
		    x1 += 10;
		    x2 += 10;
		}



		// Draw Yellow Diagonal Dots

                Expo.setColor(g,Expo.gold);
		x1 = 505;
		y1 = 290;
		for (int k = 1; k <= 25; k++)
		{
		    Expo.drawPoint(g,x1,y1);
		    x1 += 10;
		    y1 -= 10;
		}



		// Draw Green Concentric Circles

                Expo.setColor(g,Expo.green);
		x1 = 875;
		y1 = 175;
                int r1 = 10;
		for (int k = 1; k <= 12; k++)
		{
		    Expo.drawCircle(g,x1,y1,r1);
		    r1 += 10;
		}


		// Draw Purple Concentric Ovals

                Expo.setColor(g,Expo.purple);
		x1 = 125;
		y1 = 490;
                r1 = 10;
                int r2 = 13;
		for (int k = 1; k <= 12; k++)
		{
		    Expo.drawOval(g,x1,y1,r1,r2);
		    r1 += 10;
                    r2 += 13;
                }



		// Draw Pink Concentric Arcs

                Expo.setColor(g,Expo.pink);
		x1 = 251;
		y1 = 650;
                r1 = 10;
                int deg1 = 0;
                int deg2 = 90;
		for (int k = 1; k <= 24; k++)
		{
		    Expo.drawArc(g,x1,y1,r1,r1,deg1,deg2);
		    r1 += 10;
                }



		// Draw Brown Concentric Rectangles
                
                Expo.setColor(g,Expo.brown);
		x1 = 620;
		y1 = 445;
                x2 = 630;
		y2 = 535;
                
		for (int k = 1; k <= 12; k++)
		{
		    Expo.drawRectangle(g,x1,y1,x2,y2);
		    x1 -= 10;
                    y1 -= 10;
                    x2 += 10;
                    y2 += 10;
                }



		// Draw Gold Sphere

                Expo.setColor(g,Expo.gold);
		x1 = 875;
		y1 = 490;
                r1 = 10;
                r2 = 120;
                deg1 = 270;
                deg2 = 90;
                int deg3 = 0;
                int deg4 = 180;
		for (int k = 1; k <= 11;  k++)
		{
		    Expo.drawArc(g,x1,y1,r1,r2,deg1,deg2);
                    Expo.drawArc(g,x1,y1,r1,r2,deg2,deg1);
                    Expo.drawArc(g,x1,y1,r2,r1,deg3,deg4);
                    Expo.drawArc(g,x1,y1,r2,r1,deg4,deg3);
		    r1 += 10;
                }



	}
}




