import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.JApplet;

public class EZDraw
{
        
        static final double twoPI     = 2 * Math.PI;
	static final double halfPI    = Math.PI / 2;
	static final double quarterPI = Math.PI / 4;
        
        
        // 7 primary colors
	static final Color red            = Color.red;
	static final Color green          = Color.green;
	static final Color blue           = Color.blue;
	static final Color orange         = Color.orange;
	static final Color yellow         = Color.yellow;
	static final Color gray           = Color.gray;
	static final Color tan            = new Color(210,180,140);


	//dark and light shades of all of the above primary colors
	static final Color lightRed       = new Color(255,128,128);
	static final Color darkRed        = new Color(192,0,0);

	static final Color lightOrange    = new Color(255,224,0);
	static final Color darkOrange     = new Color(255,128,0);

	static final Color lightYellow    = new Color(255,255,128);
	static final Color darkYellow     = new Color(192,192,0);

	static final Color lightGreen     = new Color(128,255,128);
	static final Color darkGreen      = new Color(0,128,0);

	static final Color lightBlue      = new Color(128,128,255);
	static final Color darkBlue       = new Color(0,0,128);

	static final Color lightTan       = new Color(231,198,154);
	static final Color darkTan        = new Color(189,145,87);

	static final Color lightGray      =	Color.lightGray;
	static final Color darkGray       = Color.darkGray;

	// 15 special colors (which do not have multiple shades provided)
	static final Color pink           = Color.pink;
	static final Color black          = Color.black;
	static final Color white          = Color.white;
	static final Color cyan           = Color.cyan;
	static final Color magenta        = Color.magenta;
	static final Color brown          = new Color(150,100,15);
	static final Color violet         = new Color(240,128,240);
	static final Color purple         = new Color(128,0,128);
	static final Color turquoise      = new Color(64,224,208);
	static final Color indigo         = new Color(75,0,130);
	static final Color gold           = new Color(255,215,0);
	static final Color silver         = new Color(192,192,192);
	static final Color bronze         = new Color(164,102,40);
	static final Color teal           = new Color(0,128,128);
	static final Color lime           = new Color(50,205,50);


	// allows for alternative spelling of "grey"
	static final Color grey = gray;
	static final Color lightGrey = lightGray;
	static final Color darkGrey = darkGray;

	static Color currentColor = black;

        public static void setColor(Graphics g, Color newColor)
	{
		g.setColor(newColor);
		currentColor = newColor;
	}
        public static void setBackground(Graphics g, Color bgColor)
	{
	    g.setColor(bgColor);
	    fillRectangle(g,0,0,4800,3600);
	    setColor(g,currentColor);
	}
        public static void drawPixel(Graphics g, int x, int y)
	{
		g.drawLine(x,y,x,y);
	}
        public static void drawCircle(Graphics g, int centerX, int centerY, int radius)
	{
		int diameter = 2 * radius;
		g.drawOval(centerX-radius, centerY-radius, diameter, diameter);
	}
        public static void drawOval(Graphics g, int centerX, int centerY, int hRadius, int vRadius)
	{
		int hDiameter = 2 * hRadius;
		int vDiameter = 2 * vRadius;
		g.drawOval(centerX-hRadius, centerY-vRadius, hDiameter, vDiameter);
	}
        public static void drawArc(Graphics g, int centerX, int centerY, int hRadius, int vRadius, int start, int finish)
	{
		int hDiameter = 2 * hRadius;
		int vDiameter = 2 * vRadius;

		if (finish < start)
			finish += 360;
		int newStart  = 90 - start;   // shifts starting position from 3:00 to 12:00
		int newFinish = start-finish; // as opposed to finish-start.  Subtracting backwards changes from counter-clockwise to clockwise.

		g.drawArc(centerX-hRadius, centerY-vRadius, hDiameter, vDiameter, newStart, newFinish);
	}
        public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int x5,int y5)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9,int x10,int y10)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	myPoly.addPoint(x10,y10);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9,int x10,int y10,int x11,int y11)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	myPoly.addPoint(x10,y10);
	 	myPoly.addPoint(x11,y11);
	 	g.drawPolygon(myPoly);
	}


	public static void drawPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9,int x10,int y10,int x11,int y11,int x12,int y12)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	myPoly.addPoint(x10,y10);
	 	myPoly.addPoint(x11,y11);
	 	myPoly.addPoint(x12,y12);
	 	g.drawPolygon(myPoly);
	}
        public static void drawRegularPolygon(Graphics g, int centerX, int centerY, int radius, int sides)
	{
		int xCoord[] = new int[sides];
		int yCoord[] = new int[sides];

	 	double rotate;
	    if (sides % 2 == 1)
	    	rotate = halfPI;
	    else
	    	rotate = halfPI + Math.PI/sides;

		for (int k = 0; k < sides; k++)
		{
			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * radius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * radius) + centerY;
		}
		if (sides == 3)
			yCoord[1] = yCoord[2];
		g.drawPolygon(xCoord,yCoord,sides);
	}
        public static void drawRectangle(Graphics g, int x1, int y1, int x2, int y2)
	{
		int temp;
		if (x1 > x2)
			{ temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2)
			{ temp = y1; y1 = y2; y2 = temp; }
		int width  = x2 - x1;
		int height = y2 - y1;
		g.drawRect(x1,y1,width,height);
	}
        public static void drawStar(Graphics g, int centerX, int centerY, int radius, int points)
	{
		int halfRadius = getHalfRadius(radius, points);
		int p = points;
		points *= 2;

		int xCoord[] = new int[points];
		int yCoord[] = new int[points];

		int currentRadius;

		for (int k = 0; k < points; k++)
		{
			if (k % 2 == 0)
				currentRadius = radius;
			else
				currentRadius = halfRadius;

			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/points - halfPI) * currentRadius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/points - halfPI) * currentRadius) + centerY;
		}

		int x = (p-5)/2+1;
		if (p >= 5 && p <= 51)
			switch(p % 4)
			{
				case  1 : yCoord[x] = yCoord[x+1] = yCoord[points-x-1] = yCoord[points-x]; break;
				case  2 : yCoord[x] = yCoord[x+1] = yCoord[points-x-1] = yCoord[points-x];
					      yCoord[x+3] = yCoord[x+4] = yCoord[points-x-4] = yCoord[points-x-3]; break;
				case  3 : yCoord[x+2] = yCoord[x+3] = yCoord[points-x-3] = yCoord[points-x-2];
			}
		g.drawPolygon(xCoord,yCoord,points);
	}
        public static void fillCircle(Graphics g, int centerX, int centerY, int radius)
	{
		int diameter = 2 * radius;
		g.fillOval(centerX-radius, centerY-radius, diameter, diameter);
	}
        public static void fillOval(Graphics g, int centerX, int centerY, int hRadius, int vRadius)
	{
		int hDiameter = 2 * hRadius;
		int vDiameter = 2 * vRadius;
		g.fillOval(centerX-hRadius, centerY-vRadius, hDiameter, vDiameter);
	}
        public static void fillArc(Graphics g, int centerX, int centerY, int hRadius, int vRadius, int start, int finish)
	{
		int hDiameter = 2 * hRadius;
		int vDiameter = 2 * vRadius;

		if (finish < start)
			finish += 360;
		int newStart  = 90 - start;   // shifts starting position from 3:00 to 12:00
		int newFinish = start-finish; // as oppose to finish-start.  Subtracting backwards changes from counter-clockwise to clockwise.

		g.fillArc(centerX-hRadius, centerY-vRadius, hDiameter, vDiameter, newStart, newFinish);
	}
        public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int x5,int y5)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9,int x10,int y10)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	myPoly.addPoint(x10,y10);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9,int x10,int y10,int x11,int y11)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	myPoly.addPoint(x10,y10);
	 	myPoly.addPoint(x11,y11);
	 	g.fillPolygon(myPoly);
	}


	public static void fillPolygon(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,
											  int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,
											  int x9,int y9,int x10,int y10,int x11,int y11,int x12,int y12)
	{
	 	Polygon myPoly = new Polygon();
	 	myPoly.addPoint(x1,y1);
	 	myPoly.addPoint(x2,y2);
	 	myPoly.addPoint(x3,y3);
	 	myPoly.addPoint(x4,y4);
	 	myPoly.addPoint(x5,y5);
	 	myPoly.addPoint(x6,y6);
	 	myPoly.addPoint(x7,y7);
	 	myPoly.addPoint(x8,y8);
	 	myPoly.addPoint(x9,y9);
	 	myPoly.addPoint(x10,y10);
	 	myPoly.addPoint(x11,y11);
	 	myPoly.addPoint(x12,y12);
	 	g.fillPolygon(myPoly);
	}
        public static void fillRegularPolygon(Graphics g, int centerX, int centerY, int radius, int sides)
	{
		int xCoord[] = new int[sides];
		int yCoord[] = new int[sides];

	 	double rotate;
	    if (sides % 2 == 1)
	    	rotate = halfPI;
	    else
	    	rotate = halfPI + Math.PI/sides;

		for (int k = 0; k < sides; k++)
		{
			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - rotate) * radius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - rotate) * radius) + centerY;
		}
		if (sides == 3)
			yCoord[1] = yCoord[2];
		g.fillPolygon(xCoord,yCoord,sides);
	}
	public static void fillRectangle(Graphics g, int x1, int y1, int x2, int y2)
	{
		int temp;
		if (x1 > x2)
			{ temp = x1; x1 = x2; x2 = temp; }
		if (y1 > y2)
			{ temp = y1; y1 = y2; y2 = temp; }
		int width  = x2 - x1 + 1;
		int height = y2 - y1 + 1;
		g.fillRect(x1,y1,width,height);
	}
	private static int getHalfRadius(int radius, int points)
	{
		int halfRadius;

		switch(points)
		{
			case  3 : halfRadius = 140 * radius / 500; break;
			case  4 : halfRadius = 170 * radius / 400; break;
			case  5 : halfRadius = 192 * radius / 500; break;
			case  6 : halfRadius = 233 * radius / 400; break;
			case  7 : halfRadius = 179 * radius / 500; break;
			case  8 : halfRadius = 215 * radius / 400; break;
			case  9 : halfRadius = 173 * radius / 500; break;
			case 10 : halfRadius = 212 * radius / 400; break;
			default : if (points < 52)
				  	  {
				     	  if (points % 2 == 1)
					      	  halfRadius = (180-points) * radius / 500;
				     	  else
		                	  halfRadius = (222-points) * radius / 400;
				  	  }
				  	  else
				 	 	  halfRadius = radius / 2;
		}
		return halfRadius;
	}
	
public static void fillStar(Graphics g, int centerX, int centerY, int radius, int points)
	{
		int halfRadius = getHalfRadius(radius, points);
		int p = points;
		points *= 2;

		int xCoord[] = new int[points];
		int yCoord[] = new int[points];

		int currentRadius;

		for (int k = 0; k < points; k++)
		{
			if (k % 2 == 0)
				currentRadius = radius;
			else
				currentRadius = halfRadius;

			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/points - halfPI) * currentRadius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/points - halfPI) * currentRadius) + centerY;
		}

		int x = (p-5)/2+1;
		if (p >= 5 && p <= 51)
			switch(p % 4)
			{
				case  1 : yCoord[x] = yCoord[x+1] = yCoord[points-x-1] = yCoord[points-x]; break;
				case  2 : yCoord[x] = yCoord[x+1] = yCoord[points-x-1] = yCoord[points-x];
					      yCoord[x+3] = yCoord[x+4] = yCoord[points-x-4] = yCoord[points-x-3]; break;
				case  3 : yCoord[x+2] = yCoord[x+3] = yCoord[points-x-3] = yCoord[points-x-2];
			}
		g.fillPolygon(xCoord,yCoord,points);
	}
}
