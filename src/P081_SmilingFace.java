import javax.swing.*;
import java.awt.*;

public class P081_SmilingFace extends Canvas{
    public void paint( Graphics g ){
        //head
        g.drawOval(200,90,200,200);
        g.setColor(new Color(253, 255, 57));
        g.fillOval(200,90,200,200);// a filled-in oval
        //eyes
        g.drawOval(250,150,20,20);
        g.setColor(new Color(148, 219, 255));
        g.fillOval(250,150,20,20);// a filled-in oval
        g.drawOval(340,150,20,20);
        g.setColor(new Color(148, 219, 255));
        g.fillOval(340,150,20,20);// a filled-in oval
        //mouth
        g.drawArc(225,130,150,150,180,180);
        g.setColor(new Color(255, 92, 82));
        g.fillArc(225,130,150,150,180,180);
    }
    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Smiling Face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P081_SmilingFace canvas = new P081_SmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
}

