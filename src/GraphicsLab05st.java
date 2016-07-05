// GraphicsLab05st.java
// This is the student, starting file of Graphics Lab 05.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the redefined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.


import java.awt.*;
import java.applet.*;


public class GraphicsLab05st extends Applet
{
        public void init()
        {
                super.init();
                setPreferredSize(new Dimension(1000, 1000));
        }
	public void paint(Graphics g)
	{
		XmasTree myTree = new XmasTree();
		myTree.drawTrunk(g);
		myTree.drawLeaves(g);

	}
}



class Tree
{
	// Do NOT alter this Tree class in any way!

	public void drawTrunk(Graphics g)
	{
		Expo.setColor(g,Expo.brown);
		Expo.fillRectangle(g,475,395,525,600);
	}

	public void drawLeaves(Graphics g)
	{
		Expo.setColor(g,Expo.green);
		Expo.fillCircle(g,500,300,100);
	}
}



class PineTree extends Tree
{
        @Override
        public void drawLeaves(Graphics g)
        {
                Expo.setColor(g, Expo.green);
                Expo.fillPolygon(g, 400, 400, 500, 200, 600, 400);
                Expo.fillPolygon(g, 400, 350, 500, 150, 600, 350);
                Expo.fillPolygon(g, 400, 450, 500, 250, 600, 450);
        }

}

class XmasTree extends PineTree
{
        @Override
        public void drawLeaves(Graphics g)
        {
                super.drawLeaves(g);
                Expo.setColor(g, Expo.red);
                Expo.fillCircle(g, 400, 410, 10);
                Expo.fillCircle(g, 400, 360, 10);
                Expo.fillCircle(g, 400, 460, 10);
                Expo.fillCircle(g, 600, 410, 10);
                Expo.fillCircle(g, 600, 360, 10);
                Expo.fillCircle(g, 600, 460, 10);
        }

}

