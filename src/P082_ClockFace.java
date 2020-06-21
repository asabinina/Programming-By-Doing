import javax.swing.*;
import java.awt.*;

public class P082_ClockFace
     extends Canvas {
        public void paint( Graphics g ){
            //Clock Head
            g.setColor(Color.black);
            g.drawOval(200,90,200,200);
            //middle
            g.setColor(Color.lightGray);
            g.drawOval(290,185,20,20);
            g.fillOval(290,185,20,20);
            //numbers
            g.setColor(Color.black);
            g.drawString("3",365, 195);
            g.drawString("6",295, 270);
            g.drawString("9",225, 195);
            g.drawString("12",295, 125);
            //hands
            g.drawLine(300,185,300,125);
            g.drawLine(300,185,300,120);
        }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("Clock Face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P082_ClockFace canvas = new P082_ClockFace();
        win.add( canvas );
        win.setVisible(true);
    }
}
