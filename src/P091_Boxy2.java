import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class P091_Boxy2 extends Canvas
{
    public void paint( Graphics window )
    {
        //                  color    x    y
        drawBox( window, Color.RED, 200, 100 );
        drawBox( window,new Color(255, 172, 94), 290, 190);
        drawBox( window, Color.yellow, 380, 280 );
        drawBox( window, Color.green, 470, 370 );
        drawBox( window,new Color(129, 212, 255), 560, 460);
        drawBox( window,new Color(190, 177, 255), 650, 550);
        drawBox( window, Color.PINK, 1100, 1000 );
        drawBox( window,new Color(255, 110, 244), 740, 640);
        drawBox( window,new Color(202, 255, 92), 830, 730);
        drawBox( window,new Color(255, 39, 137), 920, 820);
        drawBox( window,new Color(117, 135, 255), 1010, 910);

    }

    public void drawBox( Graphics window, Color c, int x, int y )
    {
        window.setColor(c);
        window.fillRect(x,y,100,100);
        // this code "erases" the center of the box by painting over it in white
        window.setColor(Color.WHITE);
        window.fillRect(x+10,y+10,80,80);
    }


    public static void main( String[] args )
    {
        Canvas canvas = new P091_Boxy2();
        JFrame win = new JFrame("P091_Boxy2 - use function - all boxes same size");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}