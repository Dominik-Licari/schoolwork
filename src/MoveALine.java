import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MoveALine extends JFrame {

   /** The entry main() method */
   public static void main(String[] args) {
      MoveALine runMe =  new MoveALine(); // Let the constructor do the job
   }


   ////////////////////////////////////////////////////////
   // CLASS VARIABLES
   ////////////////////////////////////////////////////////   
   public static final int CANVAS_WIDTH = 400;
   public static final int CANVAS_HEIGHT = 140;
   public static final Color LINE_COLOR = Color.BLACK;
   public static final Color CANVAS_BACKGROUND = Color.CYAN;
 
   // The line from (x1, y1) to (x2, y2), initially position at the center
   private int x1 = CANVAS_WIDTH / 2;
   private int y1 = CANVAS_HEIGHT / 8;
   private int x2 = x1;
   private int y2 = CANVAS_HEIGHT / 8 * 7;
 
   private DrawCanvas canvas; // the custom drawing canvas (extends JPanel)
   
   

   ////////////////////////////////////////////////////////
   // INNER CLASS (UTILITY)
   ////////////////////////////////////////////////////////
   /* DrawCanvas (inner class) is a JPanel used for custom drawing
    */
   class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         setBackground(CANVAS_BACKGROUND);
         g.setColor(LINE_COLOR);
         g.drawLine(x1, y1, x2, y2); // draw the line
      }
   }
   
  
   ////////////////////////////////////////////////////////
   // CONSTRUCTOR FOR GUI
   //////////////////////////////////////////////////////// 
   public MoveALine() {
   
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
   JButton btnLeft = new JButton("Move Left ");
      btnPanel.add(btnLeft);
      btnLeft.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            x1 -= 10;
            x2 -= 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      JButton btnRight = new JButton("Move Right");
      btnPanel.add(btnRight);
      btnRight.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            x1 += 10;
            x2 += 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
 
 
      // "this" JFrame fires KeyEvent
      addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent evt) {
            switch(evt.getKeyCode()) {
               case KeyEvent.VK_LEFT:
                  x1 -= 10;
                  x2 -= 10;
                  repaint();
                  break;
               case KeyEvent.VK_RIGHT:
                  x1 += 10;
                  x2 += 10;
                  repaint();
                  break;
            }
         }
      });
      
      //Setup the Frame the way we want it
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setTitle("Move a Line");
      pack();           // automagically resize the frame to fit the components
      setVisible(true); // this line is always after adding components
      
      requestFocus();   // set the focus to JFrame to receive KeyEvent
   }//end constructor
 
  
  
}