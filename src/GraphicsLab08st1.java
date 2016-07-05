// GraphicsLab08st1.java
// The Graphics Sorter
// This is the student, starting file for the First Version of Graphics Lab 07.


import java.util.*;
import java.awt.*;
import java.applet.*;

public class GraphicsLab08st1 extends Applet
{

	private int numBars;	// number of bars to be sorted
	int barHeight[];		// array of bar heights
	int sortDelay;
	int count;				// delay between comparison iteration


	public void init()
	{
                setPreferredSize(new Dimension(1000,1000));
		numBars = 47;
		sortDelay = 3000;
		barHeight = new int[numBars];
		getBarValues();
		count = 1;
	}


	public void getBarValues()
	{
		Random rand = new Random(3333);
		for (int k = 0; k < numBars; k++)
			barHeight[k] = rand.nextInt(591) + 10;  // range of 10..600
	}


	public void paint(Graphics g)
	{
		showFrame(g);
		displayBars(g);
		sortBars(g);
		Expo.delay(sortDelay);
		showFrame(g);
		displayBars(g);
	}


	public void showFrame(Graphics g)
	{
		Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,0,0,1000,650);
		Expo.setColor(g,Expo.black);
		Expo.fillRectangle(g,0,0,1000,15);
		Expo.fillRectangle(g,0,0,15,650);
		Expo.fillRectangle(g,0,635,1000,650);
		Expo.fillRectangle(g,985,0,1000,650);
	}


	public void displayBars(Graphics g)
	{
		if (count == 1)
			Expo.setColor(g,Expo.red);
		else
			Expo.setColor(g,Expo.blue);
		int x = 25;
		int x2 = 35;
		int y = 635;

		for (int k=0; k<numBars; k++)
		{
			int y2 = 635 - barHeight[k];
			Expo.fillRectangle(g,x,y,x2,y2);
			x+=20;
			x2+=20;
		}
		count = 2;
	}


	public void sortBars(Graphics g)
	{
                for (int i = 0; i < numBars; i++)
                {
                        for (int j = 1; j < numBars; j++)
                        {
                                if (barHeight[j-1] > barHeight[j])
                                        swap(j-1, j);
                                
                        }
                }
	}


  	private void swap(int x, int y)
  	{
                int tmp = barHeight[x];
                barHeight[x] = barHeight[y];
                barHeight[y] = tmp;
        }

}




