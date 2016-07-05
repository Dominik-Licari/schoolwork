// GraphicsLab05st.java
// This is the student, starting file of Graphics Lab 05.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the redefined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.


import java.awt.*;
import java.applet.*;


public class GraphicsLab05st extends Applet
{
	public void paint(Graphics g)
	{
		Tree myTree = new Tree();
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
                Expo.fillPolygon(g, 400, 400, 450, 200, 500, 400);
        }

}

