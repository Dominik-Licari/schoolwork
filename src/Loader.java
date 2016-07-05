import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
import java.io.File;
public class Loader extends JFrame
{
        Button[] buttons;
        Applet[] applets;
        public Loader()
        {
                Buttons.init();
                buttons = Buttons.buttons;
                applets = Buttons.applets;
        }
        
        public static void main(String...z)
        {
                Loader bob = new Loader();
                bob.run();
        }
        
        public void run()
        {
                
                setSize((200),(buttons.length * 40));
                setLayout(new GridLayout(buttons.length, 1));
                for (int i = 0; i < buttons.length; i++)
                {
                        add(buttons[i]);
                        buttons[i].addActionListener(new AppletDrawing(applets[i]));
                }
                this.setVisible(true);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
        
        
}

class AppletDrawing implements ActionListener
{
        Applet daTingFurDrawin;
        public AppletDrawing(Applet a)
        {
                daTingFurDrawin = a;
        }
        public void actionPerformed(ActionEvent e)
        {
                if (daTingFurDrawin != null)
                {
                        JFrame container = new JFrame();
                        container.setVisible(true);
                        Graphics g = container.getGraphics();
                        container.setLayout(new FlowLayout());
                        container.setPreferredSize(new Dimension(1000, 1000));  
                        container.getContentPane().add(daTingFurDrawin);
                        daTingFurDrawin.init();
                        //container.setPreferredSize(daTingFurDrawin.getPreferredSize());
                        
                        
                        daTingFurDrawin.paint(g);
                        container.pack();
                }
                else
                        System.out.println("ERR");
        }       
}
