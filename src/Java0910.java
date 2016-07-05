// Java0910.java
// The Fish class, Stage #4
// The Fish4 class redefines the moveFish method.
// Fish objects will now move without erasing themselves.
// Additionally, the Fish4 class adds a constructor, which
// draws a Fish object at a specified starting location.


import java.awt.*;
import java.applet.*;


public class Java0910 extends Applet
{
	public void paint(Graphics g)
	{
		int xPos = 100;
		int yPos = 100;
		int direction = 90;
		Fish4 f4 = new Fish4(g,xPos,yPos,direction);
                for (int k = 1; k < 7; k++)
                {
                        xPos += 80;
                        f4.moveFish(g,xPos,yPos);
                }
                f4.turnFish(g);
                for (int k = 1; k < 7; k++)
                {
                        yPos += 80;
                        f4.moveFish(g,xPos,yPos);
                }
                f4.turnFish(g);
                for (int k = 1; k < 7; k++)
                {
                        xPos -= 80;
                        f4.moveFish(g,xPos,yPos);
                }
                f4.turnFish(g);
                for (int k = 1; k < 7; k++)
                {
                        yPos -= 80;
                        f4.moveFish(g,xPos,yPos);
                }
                f4.turnFish(g);
                try {Thread.sleep(100000);}catch (Exception e){}
        }
}



class Fish4 extends Fish3
{

	public Fish4(Graphics g, int xPos, int yPos, int dir)
	{
		x = xPos;
		y = yPos;
		direction = dir;
		drawFish(g);
	}

	public void moveFish(Graphics g, int newX, int newY)
	{
		Expo.delay(1000);
		x = newX;
		y = newY;
		drawFish(g);
	}

}



class Fish3 extends Fish2
{
	public void moveFish(Graphics g, int newX, int newY)
	{
		Expo.delay(1000);
		eraseFish(g);
		x = newX;
		y = newY;
		drawFish(g);
	}
}



class Fish2 extends Fish1
{

	public void eraseFish(Graphics g)
	{
		Expo.setColor(g,Expo.white);
		switch (direction)
		{
			case 0:
				Expo.fillOval(g,x,y,15,30);
				Expo.fillPolygon(g,x,y+30,x-15,y+40,x+15,y+40);
				break;
			case 90:
				Expo.fillOval(g,x,y,30,15);
				Expo.fillPolygon(g,x-30,y,x-40,y-15,x-40,y+15);
				break;
			case 180:
				Expo.fillOval(g,x,y,15,30);
				Expo.fillPolygon(g,x,y-30,x-15,y-40,x+15,y-40);
				break;
			case 270:
				Expo.fillOval(g,x,y,30,15);
				Expo.fillPolygon(g,x+30,y,x+40,y-15,x+40,y+15);
				break;
			default:
				System.out.println("ERROR!!! Direction must be 0,90,180,270");
		}
	}

	public void turnFish(Graphics g)
	{
		Expo.delay(1000);
		eraseFish(g);
		direction += 90;
		if (direction == 360)
			direction = 0;
		drawFish(g);
	}

}



class Fish1
{
	protected int x;			// center X coordinate of the fish
	protected int y;			// center Y coordinate of the fish
	protected int direction;	// one of four directions fish is facing: 0-N, 90-E, 180-S, 270-W

	public Fish1()
	{
		x = 500;
		y = 300;
		direction = 0;
	}

	public void drawFish(Graphics g)
	{
		Expo.setColor(g,Expo.black);
		switch (direction)
		{
			case 0:
				Expo.fillOval(g,x,y,15,30);
				Expo.fillPolygon(g,x,y+30,x-15,y+40,x+15,y+40);
				break;
			case 90:
				Expo.fillOval(g,x,y,30,15);
				Expo.fillPolygon(g,x-30,y,x-40,y-15,x-40,y+15);
				break;
			case 180:
				Expo.fillOval(g,x,y,15,30);
				Expo.fillPolygon(g,x,y-30,x-15,y-40,x+15,y-40);
				break;
			case 270:
				Expo.fillOval(g,x,y,30,15);
				Expo.fillPolygon(g,x+30,y,x+40,y-15,x+40,y+15);
				break;
			default:
				System.out.println("ERROR!!! Direction must be 0,90,180,270");
		}
	}

}
