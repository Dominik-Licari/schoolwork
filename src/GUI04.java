import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI04 extends JFrame
{

	// instance variables

	private JLabel label;



        // constructor

	public GUI04()
        {

// create label
                ImageIcon image = new ImageIcon("BUGZ.jpeg");
                label = new JLabel(image);



// set label attributes

                label.setLocation(0,0);
                label.setSize(image.getIconWidth(), image.getIconHeight()); // size of image



// add label to frame

                getContentPane().add(label);





// set frame attributes

                setLayout(null);

                setSize(450, 400);

// sets size of frame window

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// program quits when close icon is pressed

                setVisible(true);

// show frame

        }



// main method

        public static void main(String[] args)

        {

                GUI04 app = new GUI04(); // run program

        }

}
