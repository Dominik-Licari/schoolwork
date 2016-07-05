import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyPaint extends JFrame 
{
  
        // Name-constants for the various dimensions
        public static final int CANVAS_WIDTH = 500;
        public static final int CANVAS_HEIGHT = 300;
        public static Color curColor = Color.red;
        
        // Lines, consists of a List of PolyLine instances
        private ArrayList<PolyLine> lines = new ArrayList<PolyLine>();
        private PolyLine currentLine;  // the current line (for capturing)
        
        /** Constructor to set up the GUI */
        public MyPaint() 
        {
                DrawCanvas canvas = new DrawCanvas();
                canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
                canvas.addMouseListener(new MouseAdapter() 
                {
                        @Override
                        public void mousePressed(MouseEvent e)
                        {
                                // Begin a new line
                                currentLine = new PolyLine(curColor);
                                lines.add(currentLine);
                                currentLine.addPoint(e.getX(), e.getY());
                                                                        
                        }
                });
                canvas.addMouseMotionListener(new MouseMotionAdapter()
                {
                        @Override
                        public void mouseDragged(MouseEvent e) 
                        {
                                currentLine.addPoint(e.getX(), e.getY());
                                repaint();  // invoke paintComponent()
                        }
                });
 
                setLayout(new BorderLayout());
                
                JPanel menu = new JPanel();
                add(menu, BorderLayout.NORTH);
                add(canvas, BorderLayout.CENTER);
               
                Button clr = new Button("Clear Canvas");
                clr.addActionListener(new ActionListener()
                {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                                lines.clear();
                                repaint();
                        }
                });
                menu.add(clr);
                Button col = new Button("Set Color");
                col.addActionListener(new ActionListener()
                {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                                curColor = JColorChooser.showDialog(null, "CULURZ", curColor);
                        }
                });
                menu.add(col);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Paint");
                pack();
                setVisible(true);
        }
        
        /** DrawCanvas (inner class) is a JPanel used for custom drawing */
        private class DrawCanvas extends JPanel 
        {
                @Override
                protected void paintComponent(Graphics g)
                { // called back via repaint(), just like paint() method
                        super.paintComponent(g);
                        for (PolyLine line: lines)
                        {
                                line.draw(g);
                        }
                }
        }
        
        /** The entry main method */
        public static void main(String[] args) {
                
                new MyPaint(); // Let the constructor do the job
        }
}//end MyPaint class


/////////////////////////////////////////////////////////////
//New Class
/////////////////////////////////////////////////////////////
class PolyLine
{
        private ArrayList<Integer> xList;  // List of x-coord
        private ArrayList<Integer> yList;  // List of y-coord
        private Color myColor;
        /** Constructor */
        public PolyLine(Color c) 
        {
                xList = new ArrayList<Integer>();
                yList = new ArrayList<Integer>();
                myColor = c;
        }
        
        /** Add a point to this PolyLine */
        public void addPoint(int x, int y)
        {
                xList.add(x);
                yList.add(y);
        }
 
   /** This PolyLine paints itself */
        public void draw(Graphics g) 
        { // draw itself
                g.setColor(myColor);
                for (int i = 0; i < xList.size() - 1; ++i) {
                        g.drawLine((int)xList.get(i), (int)yList.get(i), 
                                   (int)xList.get(i + 1),(int)yList.get(i + 1));
                }
        }
        
}
