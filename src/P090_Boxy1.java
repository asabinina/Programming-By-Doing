import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  1 - make them manually                               **
 ***********************************************************************************/

public class P090_Boxy1 extends Canvas
{
    public void paint( Graphics window )
    {
        window.setColor(Color.BLUE);
        window.fillRect(200,300,100,100);
        window.setColor(Color.WHITE);
        window.fillRect(210,310,80,80);

        window.setColor(Color.red);
        window.fillRect(400,300,100,100);
        window.setColor(Color.WHITE);
        window.fillRect(410,310,80,80);

        window.setColor(Color.yellow);
        window.fillRect(400,190,100,100);
        window.setColor(Color.WHITE);
        window.fillRect(410,200,80,80);

        window.setColor(Color.green);
        window.fillRect(200,190,100,100);
        window.setColor(Color.WHITE);
        window.fillRect(210,200,80,80);

    }

    public static void main( String[] args )
    {
        Canvas canvas = new P090_Boxy1();
        JFrame win = new JFrame("P090_Boxy1 - make them manually");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}
