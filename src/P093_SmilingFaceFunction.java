import java.awt.*;
import javax.swing.JFrame;

public class P093_SmilingFaceFunction extends Canvas
{
    public void paint( Graphics g )
    {
        drawSmilingFace(g,100,100);
        drawSmilingFace(g,400,350);
        // etc
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
        // Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.

        // draw circle for the head

        // draw eyes

        // draw mouth
    }

    public static void main(String[] args)
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("P093_Smiling Face Function");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new P093_SmilingFaceFunction() );
        win.setVisible(true);
    }

}