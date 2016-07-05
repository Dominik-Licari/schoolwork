import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Hangman
{
        static HangedMan hg;
        public static void main(String[] args) 
        {
                hg = new HangedMan();
                hg.setVisible(true);
        }
        public static void remake()
        {
                hg.dispose();
                hg = new HangedMan();
                hg.setVisible(true);
        }
}
