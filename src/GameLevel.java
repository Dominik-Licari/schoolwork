// GameLevel
// This program reads text from a file.
// Each character in the file is tied to a specific graphics image.
// By manipulating the text files, you can manipulate the background.


import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class GameLevel extends JFrame
{
        
	
        MyPanel drawingPanel; //see inner class<-- this is where you will find the paint method
 
        public GameLevel()
        {
                super("GameLevel");
                setSize(900,700);
                drawingPanel = new MyPanel();
                try 
                {
                        drawingPanel.readFile();
                } 
                catch (IOException e) 
                {
                        System.out.println("Could not open file");
                        e.printStackTrace();
                }
                add(drawingPanel);
                setVisible(true);
        }
        
        public static void main(String [] args)
        {
                GameLevel runner = new GameLevel();
        }
        
        
        
	//TO BE COMPLETED IN STEP 1
	
    
        /////////////////////////////////////////////////////////////////////////
        //Inner class MyPanel contains all the drawing methods
        /////////////////////////////////////////////////////////////////////////
        class MyPanel extends JPanel
        {
                final int r = 35;
                final int c = 50;
                char bg[][];
                final int SIZE = 20;
                //STEP 2:  ORIGINAL METHODS TO DRAW THE SHAPES ON THE SCREEN GO HERE
                public void readFile() throws IOException
                {
                        bg = new char[r][c];
                        Scanner in = new Scanner(new File("BG"));
                        for (int i = 0; i < r; i++)
                                bg[i] = in.nextLine().toCharArray();
                        in.close();
                }
                
                private void dark(Graphics g, int x, int y)
                {
                        g.setColor(Color.black);
                        g.fillRect(x * SIZE, y * SIZE, SIZE, SIZE);
                }
                private void light(Graphics g, int x, int y)
                {
                        g.setColor(Color.white);
                        g.fillRect(x * SIZE, y * SIZE, SIZE, SIZE);
                }
                public void paint(Graphics g)
                {
                        
                        //STEP 3:  YOUR CODE TO PARSE THE STRING ARRAY 
                        //AND CALL YOUR DRAWING METHODS SHOULD GO HERE
                        int x = 0;
                        int y = 0;
                        for (char[] lines : bg)
                        {
                                x = 0;
                                for (char cur : lines)
                                {
                                        switch(cur)
                                        {
                                        case 'X':
                                                dark(g, x, y);
                                                break;
                                        default:
                                                
                                                light(g, x, y);
                                        }
                                        x++;
                                }
                                y++;
                        }
                }
        }//end of MyPanel class
}
