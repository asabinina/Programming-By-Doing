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

        //head
        g.drawOval(x,y,200,200);
        g.setColor(new Color(253, 255, 57));
        g.fillOval(x,y,200,200);// a filled-in oval
        //eyes
        g.drawOval(x+50,y+60,20,20);
        g.setColor(new Color(148, 219, 255));
        g.fillOval(x+50,y+60,20,20);// a filled-in oval
        g.drawOval(x+140,y+60,20,20);
        g.setColor(new Color(148, 219, 255));
        g.fillOval(x+140,y+60,20,20);// a filled-in oval
        //mouth
        g.drawArc(x+25,y+40,150,150,180,180);
        g.setColor(new Color(255, 92, 82));
        g.fillArc(x+25,y+40,150,150,180,180);
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