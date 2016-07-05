import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author campbellcr
 * 
 * BINGO LAB!!!!
 * This class will create a Bingo board for you to use on Game Day.
 * 
 * Code is provided for the following:
 *    A GUI that will hold your Bingo squares.
 *        --Each square is a button that, when you click on it, will add a
 *          :)  smiley to indicate you've got a chosen number on the board.
 *        
 *        --There is a button at the bottom of the GUI that will reset the 
 *          numbers with appropriate values for that column.  Use this to load 
 *          a new board at the beginning of each game.
 *        
 *        
 * 
 * YOU NEED TO COMPLETE:
 * 
 *     The setValues() method.  This method will generate random numbers
 *         for each column under the B-I-N-G-O letters on the board.
 *         --The 2D array you need to fill in with values is already declared
 *            private int[][] values;
 *       
 *         --Each column has a set range of values that can show there.  See
 *           the comments in the method below for more information.  You need
 *           to design the code to fill in those values.
 * 
 *     The checkForBingo() method.  
 *         --The logic is mostly in place, but you need to look for the lines 
 *           commented with //FILL IN THE BLANKS in order to complete it.
 *    
 *    
 *    HINT:  Look for the + or - by the line numbers in Eclipse…you can collapse
 *    the methods that are complete, so you don’t have to scroll past them all the time.
 *    
 */
public class Bingo extends JFrame implements ActionListener {
    private JButton[][] squares = new JButton[5][5];
    private int [][] values = new int[5][5];
    private boolean bingo=false;
    private JButton reset;
    private JLabel[] columnLabels;
    private JLabel won = new JLabel();
    private JPanel back;
    
    public Bingo(){
        
        //CREATE WINDOW COMPONENTS
        JFrame board = new JFrame("Play Bingo!");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(500,500);
        board.setLayout(new BorderLayout());
        
        //SETUP TOP BANNER
        String letters = "BINGO";
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(1,5));
        top.setBackground(Color.BLACK);
        board.add(top,BorderLayout.NORTH);
        columnLabels = new JLabel[5];
        for(int i = 0; i< columnLabels.length;i++){
            columnLabels[i]=new JLabel(Character.toString(letters.charAt(i)));
            columnLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            columnLabels[i].setFont(new Font("Arial Black",Font.BOLD,24));
            columnLabels[i].setForeground(Color.WHITE);
            top.add(columnLabels[i]);
        }
        
        //SETUP CENTRAL SQUARES
        back = new JPanel();
        back.setLayout(new GridLayout(5,5,2,2));
        board.add(back,BorderLayout.CENTER);
        
        for (int r = 0;r<squares.length;r++)
            for(int c = 0;c<squares[r].length;c++){
                squares[r][c]= new JButton();
                squares[r][c].setHorizontalAlignment(SwingConstants.CENTER);
                squares[r][c].setFont(new Font("Arial",Font.BOLD,24));
                squares[r][c].addActionListener(this);
                back.add(squares[r][c]);
            }
        

        //SETUP BOTTOM BUTTON
        reset = new JButton("Get a new game board");
        reset.addActionListener(this);
        board.add(reset,BorderLayout.SOUTH);
        
        board.setVisible(true);
    }


///////////////////////////////////////////////////////////////////////////////
///////     SOMETHING TO DO HERE!!!  //////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
    
	public void setValues()
	{
		
		//CREATE RANDOM NUMBERS FOR SQUARES
		//FIRST COLUMN HOLDS 1-15
		//SECOND COLUMN HOLDS 16-30
		//THIRD COLUMN HOLDS 31-45
		//FOURTH COLUMN HOLDS 46-60
		//FIFTH COLUMN HOLDS 61-75
		//CHECK!
		
		//AFTER YOU HAVE FILLED IN A NEW RANDOM NUMBER, YOU NEED TO
		//DOUBLE-CHECK FOR DUPLICATES, AND RE-TRY THE RANDOM # 
		//IF A DUPLICATE IS FOUND      
		//NOCHECK!
		
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length; j++)
				values[i][j] = (int)(Math.random() * 15) + 1 + (j*15);
		
		for (int j = 0; j < values[0].length; j++) 
			for (int h = 0; h < values.length; h++) 					
				for (int i = h+1; i < values.length; i++)
				{
					if (values[h][j] == values[i][j]) 
					{
						values[i][j] = (int)(Math.random() * 15) + 1 + (j*15);
						i--;
					}		
				}		
	}
	
///////////////////////////////////////////////////////////////////////////////
   
    public void setLabels(){
    
        for(int r = 0; r<squares.length; r++)
            for(int c = 0; c<squares[r].length; c++){
                squares[r][c].setForeground(Color.BLACK);
               squares[r][c].setText(Integer.toString(values[r][c]));
                
            }
            
        squares[2][2].setText("FREE");
    }


///////////////////////////////////////////////////////////////////////////////
///////     SOMETHING TO DO HERE!!!  //////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
    
    public boolean checkForBingo(){

    //CHECK TO SEE IF THERE ARE 5 X'S IN ANY ROW
        int count;
        for(int r = 0; r < squares.length; r++){ //FILL IN THE BLANKS
            count=0;
            for(int c = 0; c < squares[r].length; c++){//FILL IN THE BLANKS
                if(squares[r][c].getText().indexOf(":)")!=-1||squares[r][c].getText().indexOf("FREE")!=-1)
                    count++;
            }
            if(count==5) 
                return true;
        }
        
    //CHECK TO SEE IF THERE ARE 5 X'S IN ANY COLUMN
        for(int c = 0; c < squares[0].length; c++){//FILL IN THE BLANKS
            count=0;
            for(int r = 0; r < squares.length; r++){//FILL IN THE BLANKS
                if(squares[r][c].getText().indexOf(":)")!=-1||squares[r][c].getText().indexOf("FREE")!=-1)
                    count++;
            }
            if(count==5) 
                return true;
        }
        
      
    //CHECK TO SEE IF THERE ARE 5 X'S ON ANY DIAGONAL
        count=0;
        for(int r = 0; r < squares.length; r++){//FILL IN THE BLANKS
            for(int c = 0; c < squares[r].length; c++){//FILL IN THE BLANKS
                if((r==c)&&(squares[r][c].getText().indexOf(":)")!=-1||squares[r][c].getText().indexOf("FREE")!=-1))
                    count++;
            }
            if(count==5) 
                return true;
        }
             
        count=0;
        for(int c = 0; c < squares[0].length; c++){//FILL IN THE BLANKS
            for(int r = 0; r < squares.length; r++){//FILL IN THE BLANKS
                if((r+c==4)&&(squares[r][c].getText().indexOf(":)")!=-1||squares[r][c].getText().indexOf("FREE")!=-1))
                    count++;
            }
            if(count==5) 
                return true;
        }
                    
        
        
        //IF WE DON'T GET A TRUE RESULT ON ANY OF THE PREVIOUS PROCESSES:
        return false;
    }
    
///////////////////////////////////////////////////////////////////////////////

    public void winner() {
        
        //CHANGE COLOR OF COLUMN HEADERS 
        for(int i = 0; i< columnLabels.length;i++){
            int r = (int)(Math.random()*106+150);
            int g = (int)(Math.random()*106+150);
            int b = (int)(Math.random()*106+150);
            columnLabels[i].setForeground(new Color(r,g,b));
        }
        
        back.setBackground(Color.CYAN);
        
    }
        
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==reset) {
            setValues();
            setLabels();
            for(int i = 0; i< columnLabels.length;i++)
                 columnLabels[i].setForeground(Color.WHITE);
            back.setBackground(Color.WHITE);
        }
        else{
            JButton button = (JButton)e.getSource();
            button.setText(button.getText()+" :)");
            if(checkForBingo())
               winner(); 
               //System.out.println("bingo");
        }
            
    }

    public static void main(String [] args){
	    Bingo board = new Bingo();		
	    board.setValues();
	    board.setLabels();
    }
}
