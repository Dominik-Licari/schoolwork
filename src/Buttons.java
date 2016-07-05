import java.applet.Applet;
import java.awt.*;
import java.util.*;
public class Buttons
{
        public static Button[] buttons;
        public static Applet[] applets;

        private static final int LEN = 6;
        public static void init()
        {
                buttons = new Button[LEN];
                applets = new Applet[LEN];
                buttons[0] = new Button("Tree");
                applets[0] = new GraphicsLab05st();
                buttons[1] = new Button("Shapes");
                applets[1] = new GraphicsLab02st();
                buttons[2] = new Button("DP");
                applets[2] = new GraphicsLab04st();
                buttons[3] = new Button("Sort");
                applets[3] = new GraphicsLab08st1();
                buttons[4] = new Button("SortAcvtive");
                applets[4] = new GraphicsLab08st2();
                buttons[5] = new Button("Hai");
                applets[5] = new HaiWurld();
                
        }
}
