import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class P096_MotivationalPoster extends Canvas {
    Image coolFace;

    public P096_MotivationalPoster() throws Exception {
        coolFace = ImageIO.read(new File("Me.jpg"));
        // Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
    }

    public void paint(Graphics g) {
        //           Image  , x,  y, this
        g.drawImage(coolFace, 100, 100, this);

        g.drawString("PETER GRIFFIN",200, 450);
        g.drawString("THE GOD",250, 480);
    }

    public static void main(String[] args) throws Exception {
        JFrame win = new JFrame("Image Demo");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new P096_MotivationalPoster());
        win.setVisible(true);
    }
}
