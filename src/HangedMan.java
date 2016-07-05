import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.awt.image.*;
import javax.imageio.*;
public class HangedMan extends JFrame implements ActionListener
{
        /////////////////////////////////////////////////
       //class variables
      /////////////////////////////////////////////////    
        
        //create the variables to store puzzle data
        String [][] choices = {{"Movies",/*"Cars", "Madagascar",*/ "Monty Python and the Holy Grail", "The Hitchhiker's Guide to the Galaxy"},
                               {"quotes",/*"To be or not to be","Hakuna Matata",*/ "I am become death, destroyer of worlds.", "Snake? Snake! SNAAAAAAAAAAAAAAAAAAAAKE!!!"},
                               {"places",/*"Timbuktu","Room W109",*/ "Berlin", "Worcestershire"},
                               {"PURE EVIL", "Rythmns", "TRUMP", "THE UNSTUMPABLE"}};    
        
        String answer;           //holds the randomly chosen puzzle string
        int countWrong=0;        //keeps track of how many wrong guesses
        int countCorrect=0;      //keeps track of how many letters filled in
        
        
        //variables to set up the panels    
        DrawCanvas hangman;
        AlphaButton [] alphabet = new AlphaButton[26];
        JLabel [] guesses;
        JPanel end;
        
/////////////////////////////////////////////////
//constructor
///////////////////////////////////////////////// 
        public HangedMan()
        {

                //set window properties
                setTitle("Hanging Chad!");
                setSize(650,500);
                setLayout(new BorderLayout());
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                
                
                //game board set up with JPanels
                JPanel alphaPanel = new JPanel();//holds the alphabet letters at the top
                alphaPanel.setLayout(new GridLayout(2,13));
                add(alphaPanel, BorderLayout.NORTH);
                
                JPanel guessedPanel = new JPanel();//holds the spaces/letters at the bottom
                guessedPanel.setLayout(new FlowLayout());
                add(guessedPanel,BorderLayout.SOUTH);
                
                hangman = new DrawCanvas();
                add(hangman, BorderLayout.CENTER);
                
                end = new JPanel();
                end.setLayout(new BorderLayout());
                add(end, BorderLayout.WEST);
                
                //load alpha components into  top JPanel
                for(int i  = 0; i<26 ; i++)
                {
                        alphabet[i] = new AlphaButton((char)(i+65) + "");
                        alphabet[i].addActionListener(this);
                        alphaPanel.add(alphabet[i]);
                }
                
                //load blanks into bottom JPanel for chosen word
                int row = (int)(Math.random()*choices.length);
                int col = (int)(Math.random()*choices[row].length-1)+1;
                
                
                guessedPanel.add(new JLabel(choices[row][0] + ": "));//display category
                
                answer = choices[row][col].toUpperCase(); //gets the puzzle 
                guesses = new JLabel [answer.length()];
                
                for(int i = 0; i< answer.length();i++)
                {
                        //TO BE COMPLETED BY STUDENTS
                        guesses[i] = new JLabel(answer.charAt(i) + "");
                        if (Character.isLetter(answer.charAt(i)))
                                guesses[i].setText("_");
                        else
                                guesses[i].setText(answer.charAt(i) + "");
                        guessedPanel.add(guesses[i]);
                }
        }        
        
/////////////////////////////////////////////////
//ActionListener required method
///////////////////////////////////////////////// 
        @Override
        public void actionPerformed(ActionEvent e) 
        {
                                
                

                //TO BE COMPLETED BY STUDENTS
                AlphaButton but =(AlphaButton)e.getSource();
                String letter = but.getLetter();
                but.setEnabled(false);
                
                
                if (answer.contains(letter))
                {
                        for (int i = 0; i < answer.length(); i++)
                                if (letter.equals(answer.substring(i,i+1)))
                                {
                                        guesses[i].setText(letter);
                                        countCorrect++;
                                }
                        }
                else
                {
                        countWrong++;
                        hangman.update(countWrong);
                }
                
                StringBuilder bob = new StringBuilder();
                for (char x : answer.toCharArray())
                        if (Character.isLetter(x))
                                bob.append(x);
                
                if (countWrong == 6)
                {
                        for (AlphaButton x : alphabet)
                                x.setEnabled(false);
                        end.add(new JLabel("Luser"), BorderLayout.NORTH);
                        AlphaButton rep = new AlphaButton("Replay");
                        rep.addActionListener(new ActionListener()
                        {
                                public void actionPerformed(ActionEvent e) 
                                {
                                        Hangman.remake();
                                }
                        });
                        end.add(rep, BorderLayout.SOUTH);
                        for (int i = 0; i < answer.length(); i++)
                                guesses[i].setText(answer.charAt(i) + "");
                }
                else if (countCorrect == bob.toString().length())
                {
                        for (AlphaButton x : alphabet)
                                x.setEnabled(false);
                        end.add(new JLabel("Winrar"), BorderLayout.NORTH);
                        AlphaButton rep = new AlphaButton("Replay");
                        rep.addActionListener(new ActionListener()
                        {
                                public void actionPerformed(ActionEvent e) 
                                {
                                        Hangman.remake();
                                }
                        });
                        end.add(rep, BorderLayout.SOUTH);
                }
                
        }
        
}//end HangedMan class


        class DrawCanvas extends JPanel
{
        int w;
        
 
        public DrawCanvas()
        {
                w = 0;
        }
        
        public void update(int wrong)
        {
                w = wrong;
                this.repaint();
        }
        public void paint(Graphics g)
        {
                switch(w)
                {
                case 6:
                        LLeg(g);
                case 5:
                        RLeg(g);
                case 4:
                        RArm(g);
                case 3:
                        LArm(g);
                case 2:
                        Torso(g);
                case 1: 
                        Head(g);
                }
        }
        
        public void LLeg(Graphics g)
        {
                g.drawLine(325, 250, 300, 350);
                try
                {
                        AudioInputStream aIn = AudioSystem.getAudioInputStream(new File("YouSuck.wav"));
                        Clip clip = (Clip)AudioSystem.getLine(new DataLine.Info(Clip.class, aIn.getFormat()));
                        clip.open(aIn);
                        clip.start();
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }
        
        public void RLeg(Graphics g)
        {
                g.drawLine(325, 250, 350, 350);
        }
        
        public void LArm(Graphics g)
        {
                g.drawLine(325, 125, 300, 225);
        }
        
        public void RArm(Graphics g)
        {
                g.drawLine(325, 125, 350, 225);
        }
        public void Head(Graphics g)
        {
                BufferedImage img = null;
                try 
                {
                        img = ImageIO.read(new File("AAHH.jpeg"));
                }
                catch (IOException e)
                {
                        System.out.println("Could not load");
                }
                //g.fillOval(300, 50, 50, 50);
                g.drawImage(img, 275, 0, 100, 100, null);
        }
        public void Torso(Graphics g)
        {
                g.drawLine(325, 100, 325, 250);
        }
        
        
}

class AlphaButton extends JButton
{
        String letter;
        public AlphaButton(String c)
        {
                letter = c;
                setText(letter);
        }
        
        public String getLetter()
        {
            return letter;
    }
}
