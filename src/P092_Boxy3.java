import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          P092_B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class P092_Boxy3 extends Canvas {
    public void paint(Graphics window) {
        //                  color       x    y   w   h
        drawBox(window, Color.YELLOW, 280, 300, 30, 38);
        drawBox(window, Color.GREEN, 400, 320, 100, 150);
        drawBox(window, Color.RED, 200, 399, 900, 600);
        drawBox(window, Color.BLUE, 490, 270, 30, 150);
        drawBox(window, Color.PINK, 400, 220, 30, 159);
        drawBox(window, Color.ORANGE, 600, 400, 90, 500);
        drawBox(window, Color.PINK, 500, 500, 600, 70);
        drawBox(window, Color.PINK, 400, 220, 30, 150);
    }

    public void drawBox( Graphics window, Color c, int x, int y , int w, int h )
    {
        window.setColor(c);
        window.fillRect(x,y,w,h);
        window.setColor(Color.WHITE);
        window.fillRect(x+10,y+10,w-20,h-20);
    }



    public static void main(String[] args) {
        Canvas canvas = new P092_Boxy3();
        JFrame win = new JFrame("P092_Boxy3 - write and use function - boxes different sizes");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add(canvas);
        win.setVisible(true);
    }
}
