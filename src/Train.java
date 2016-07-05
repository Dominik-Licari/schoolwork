import java.applet.Applet;
import java.awt.*;

public class Train extends Applet
{
    private Compartment car1, car2;
    private Engine eng1;
    private Graphics page;
    private int x, y,s;
    
    public void init()
    {
       setVisible(true);
       setBackground(Color.green);
       setSize(400,200);
       car1 = new Compartment();
       car2 = new Compartment();
       eng1 = new Engine();
       x=10;
       y=40;
       s=1;
        

    }
    public void delay()
    {
            try {
                Thread.sleep(500);
                }
            catch (Exception e)
                {
                    return;
                }
    }
    public void paint(Graphics g){
      page=getGraphics();
      page.clearRect(0,0,400,200); // clear the part of the screen having the train 
      
      Color rand = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
      page.setColor(rand);
     
       
         
         
         eng1.draw(x+180,y,s%2); // draw the engine
         page.drawLine(x+180,y+20,x+170,y+20);     // connection between engine and the 1st compartment
            
         car1.draw(x+90,y);             // the first compartment
         page.drawLine(x+90,y+20,x+80,y+20);     // connection between 1st  and 2nd  compartments
            
         car2.draw(x,y);   // the second compartment
         
         page.setColor(Color.red);
         page.drawLine(0,90,400,90); // draw the tracks
    }
    
    public void start()
    {      
     
            while(true)
            {
                    x+=15;
                    s=(s==1)?2:1;
                    delay();
                    repaint();
                    x=(x<400)?x:-250;
            }
      

     
    }//end start method

 
 class Compartment // separate class Compartment has a method draw to draw the train cars
 {
      // takes as parameters two integers that specify the top left corner of the compartment
      public void draw(int xleft, int ytop)
      {    page.fillOval(xleft+5,ytop+20,30,30);
           page.fillOval(xleft+45,ytop+20,30,30);
           page.fill3DRect(xleft,ytop,80,30,true);
           page.fill3DRect(xleft+15,ytop+5,10,5,true);
           page.fill3DRect(xleft+55,ytop+5,10,5,true);
      }    
 }// end class - Compartment
 
 class Engine  // class Engine has a method draw to draw the engine
 {
      // takes as parameters two integers that specify the top left corner of the engine and flag for smoke
      public void draw(int xleft, int ytop, int smoke)
      {   page.fillOval(xleft+5,ytop+20,30,30);
           page.fillOval(xleft+45,ytop+20,30,30);
           page.fill3DRect(xleft,ytop,50,30,true);
           page.fill3DRect(xleft+50,ytop+15,30,15,true);
           page.fill3DRect(xleft+60,ytop-10,10,25,false);
           page.fill3DRect(xleft+30,ytop+10,5,5,true);
           if (smoke==1)
              page.fillArc(xleft+60,ytop-20,10,10,0,135);
      }
 }// end class -Engine 
 
}// end class Train


