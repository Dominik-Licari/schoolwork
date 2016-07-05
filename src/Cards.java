import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cards extends JFrame
{

	// instance variables

	private JLabel labels[];



        // constructor

	public Cards()
        {
                setLayout(new FlowLayout());
                ImageIcon images[] = new ImageIcon[3];
                images[0] = new ImageIcon("Jack.gif");
                images[1] = new ImageIcon("Queen.gif");
                images[2] = new ImageIcon("King.gif");
                labels = new JLabel[3];
                for (int i = 0; i < 3; i++)
                {
                        labels[i] = new JLabel(images[i]);
                        labels[i].setSize(images[i].getIconWidth(), images[i].getIconHeight()); 
                        getContentPane().add(labels[i]);
                }
                setSize(1000, 1000);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
        }





        public static void main(String[] args)

        {

                Cards app = new Cards(); // run program

        }

}
