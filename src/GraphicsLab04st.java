// GraphicsLab04st.java
// The OOP Graphics Program
// This is the student, starting file for Graphics Lab 04.
// This is an "Open-Ended" asignment.


import java.awt.*;
import java.applet.*;
import java.util.*;
public class GraphicsLab04st extends Applet
{
        public void init()
        {
                super.init();
                setPreferredSize(new Dimension(300, 300));
        }
	public void paint(Graphics g) 
	{
                new Drawin(g);
        }
        
}


