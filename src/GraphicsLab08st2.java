// GraphicsLab08st2.java
// The Graphics Sorter
// This is the student, starting file for the 100 Point Version of Graphics Lab 07.


import java.util.*;
import java.awt.*;
import java.applet.*;


public class GraphicsLab08st2 extends Applet
{
	private int numBars;     	// number of bars to be sorted
	private int barHeight[]; 	// array of bar heights
	private int sortDelay;	 	// delay between comparison iteration

	public void init()
	{
                setPreferredSize(new Dimension(1000,1000));
		numBars = 47;
		sortDelay = 10;
		barHeight = new int[numBars];
		getBarValues();
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
		displayRandomBars(g);
		sortBars(g);
	}


	public void showFrame(Graphics g)
	{
                Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,0,0,1000,650);
		
		Expo.setColor(g,Expo.black);
		Expo.fillRectangle(g,0,0,1000,20);
		Expo.fillRectangle(g,0,630,1000,650);
		Expo.fillRectangle(g,0,20,20,630);
		Expo.fillRectangle(g,980,20,1000,650);
	}


	public void drawBar(Graphics g, int k)
	{
		int y2 = 630;
		int x1 = 35 + k * 20;
		int y1 = y2 - barHeight[k];
		int x2 = x1 + 10;
		Expo.setColor(g,Expo.red);
		Expo.fillRectangle(g,x1,y1,x2,y2);
	}


	public void eraseBar(Graphics g, int k)
	{
              int y2 = 630;
              int x1 = 35 + k * 20;
              int y1 = y2 - barHeight[k];
              int x2 = x1 + 10;
              Expo.setColor(g,Expo.white);
              Expo.fillRectangle(g,x1,y1,x2,y2);  
	}
        
        
	public void displayRandomBars(Graphics g)
	{
		for (int k = 0; k < numBars; k++)
		 	drawBar(g,k);
	}

        
	public void swap(Graphics g, int m, int n)
	/*
	 * Precondition:   	m & n are integers between 0 and numBars
	 * Postcondition:  	The old bars, representing the values stored in the barHeight at indexes m and n are erased.
	 *					The vaules stored at indexes m and n in the barHeight array are swapped.
	 *					Newbars, representing the new values stored in the barHeight at indexes m and n are drawn.
	 */
	{
                eraseBar(g, m);
                eraseBar(g, n);
                int tmp = barHeight[m];
                barHeight[m] = barHeight[n];
                barHeight[n] = tmp;
                drawBar(g, m);
                drawBar(g, n);
                try
                {
                        Thread.sleep(sortDelay);
                }
                catch(InterruptedException e)
                {
                        e.printStackTrace();
                }
	}
        public void updateBar(Graphics g, int x, int n)
        {
                eraseBar(g, x);
                barHeight[x] = n;
                drawBar(g, x);
                try
                {
                        Thread.sleep(sortDelay);
                }
                catch(InterruptedException e)
                {
                        e.printStackTrace();
                }
        }
	public void sortBars(Graphics g)
	{
                //bubbleSort(g);
                //selectionSort(g);
                insertionSort(g);
        }
        public void bubbleSort(Graphics g)
        {
                for (int i = 0; i < numBars; i++)
                {
                        for (int j = 1; j < numBars; j++)
                        {
                                if (barHeight[j-1] > barHeight[j])
                                        swap(g, j-1, j);
                                
                        }
                }
        }
        public void selectionSort(Graphics g)
        {
                int n = numBars;
                while (n > 1)
                {
                        int max = 0;
                        for (int i = 0; i < n; i++)
                                max = barHeight[max] < barHeight[i] ? i : max;
                        swap(g, max, n-1);
                        n--;
                }
        }
        public void insertionSort(Graphics g)
        {
                for (int k = 1; k < numBars; k++)
                {
                        int tmp = barHeight[k];
                        int i;
                        for (i = k; i > 0 && barHeight[i-1] > tmp; i--)
                        {
                                updateBar(g, i, barHeight[i-1]);
                        }
                        updateBar(g, i,  tmp);
                }
        }
        
}
