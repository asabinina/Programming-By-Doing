import javax.swing.*;
import java.awt.*;
public class P080_Circle extends Canvas {
    public void paint( Graphics g ){
        g.drawOval(200,430,100,100);
        g.setColor(new Color(47, 255, 14));
        g.fillOval(200,430,100,100);// a filled-in oval
    }
    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P080_Circle canvas = new P080_Circle();
        win.add( canvas );
        win.setVisible(true);
    }
}
