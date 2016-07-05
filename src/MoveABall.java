import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MoveABall extends JFrame 
{

   /** The entry main() method */
        public static void main(String[] args) 
        {
                MoveABall runMe =  new MoveABall(); // Let the constructor do the job
        }


        ////////////////////////////////////////////////////////
        // CLASS VARIABLES
        ////////////////////////////////////////////////////////   
        public static final int CANVAS_WIDTH = 400;
        public static final int CANVAS_HEIGHT = 140;
        public static final Color LINE_COLOR = Color.BLACK;
        public static final Color CANVAS_BACKGROUND = Color.CYAN;
        
        private int x = CANVAS_WIDTH / 2;
        private int y = CANVAS_HEIGHT / 2;
        private int size = CANVAS_HEIGHT / 4;
        
        private DrawCanvas canvas; // the custom drawing canvas (extends JPanel)
        
        
        
        ////////////////////////////////////////////////////////
        // INNER CLASS (UTILITY)
        ////////////////////////////////////////////////////////
        /*
          DrawCanvas (inner class) is a JPanel used for custom drawing
        */
        class DrawCanvas extends JPanel 
        {
                @Override
                public void paintComponent(Graphics g) 
                {
                        super.paintComponent(g);
                        setBackground(CANVAS_BACKGROUND);
                        g.setColor(LINE_COLOR);
                        g.fillOval(x, y, size, size); // draw the ball
                }
        }
        
  
        ////////////////////////////////////////////////////////
        // CONSTRUCTOR FOR GUI
        //////////////////////////////////////////////////////// 
        public MoveABall() 
        {
                
                // Set up a panel for the buttons
                JPanel btnPanel = new JPanel(new FlowLayout()); //automatically centers and wraps components
                
                // Set up a custom drawing JPanel
                canvas = new DrawCanvas();
                canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
                
                // Add both panels to this JFrame
                Container cp = getContentPane();
                cp.setLayout(new BorderLayout());
                cp.add(canvas, BorderLayout.CENTER);
                cp.add(btnPanel, BorderLayout.SOUTH);
   
                //Add Components to btnPanel
                JButton btnUp = new JButton("Move Up ");
                btnPanel.add(btnUp);
                btnUp.addActionListener(new ActionListener() 
                {
                        public void actionPerformed(ActionEvent e)
                        {
                                y -= 10;
                                canvas.repaint();
                                requestFocus(); // change the focus to JFrame to receive KeyEvent
                        }
                });
                JButton btnLeft = new JButton("Move Left ");
                btnPanel.add(btnLeft);
                btnLeft.addActionListener(new ActionListener() 
                {
                        public void actionPerformed(ActionEvent e)
                        {
                                x -= 10;
                                canvas.repaint();
                                requestFocus(); // change the focus to JFrame to receive KeyEvent
                        }
                });
                JButton btnRight = new JButton("Move Right");
                btnPanel.add(btnRight);
                btnRight.addActionListener(new ActionListener() 
                {
                        public void actionPerformed(ActionEvent e)
                        {
                                x += 10;
                                canvas.repaint();
                                requestFocus(); // change the focus to JFrame to receive KeyEvent
                        }
                });
                JButton btnDown = new JButton("Move Down");
                btnPanel.add(btnDown);
                btnDown.addActionListener(new ActionListener() 
                {
                        public void actionPerformed(ActionEvent e)
                        {
                                y += 10;
                                canvas.repaint();
                                requestFocus(); // change the focus to JFrame to receive KeyEvent
                        }
                });
                
                // "this" JFrame fires KeyEvent
                addKeyListener(new KeyAdapter()
                {
                        @Override
                        public void keyPressed(KeyEvent evt) 
                        {
                                switch(evt.getKeyCode()) 
                                {
                                case KeyEvent.VK_LEFT:
                                        x -= 10;
                                        repaint();
                                        break;
                                case KeyEvent.VK_RIGHT:
                                        x += 10;
                                        repaint();
                                        break;
                                case KeyEvent.VK_UP:
                                        y -= 10;
                                        repaint();
                                        break;
                                case KeyEvent.VK_DOWN:
                                        y += 10;
                                        repaint();
                                        break;
                                
                                case KeyEvent.VK_A:
                                        x -= 10;
                                        repaint();
                                        break;
                                case KeyEvent.VK_D:
                                        x += 10;
                                        repaint();
                                        break;
                                case KeyEvent.VK_W:
                                        y -= 10;
                                        repaint();
                                        break;
                                case KeyEvent.VK_S:
                                        y += 10;
                                        repaint();
                                        break;
                                
                                }
                        }
                });
                
                //Setup the Frame the way we want it
                
                
                setTitle("Move a Ball");
                pack();           // automagically resize the frame to fit the components
                setVisible(true); // this line is always after adding components
                
                requestFocus();   // set the focus to JFrame to receive KeyEvent
        }//end constructor
}
