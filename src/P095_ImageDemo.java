import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;
public class P095_ImageDemo extends Canvas
{
    Image coolFace;

    public P095_ImageDemo() throws Exception
    {
        coolFace = ImageIO.read( new File("Me.jpg") );
        // Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
    }

    public void paint( Graphics g )
    {
        //           Image  , x,  y, this
        g.drawImage(coolFace,100,100,this);

        // And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.
        g.setColor( Color.yellow );
        g.drawOval(88,88,70,25);
    }

    public static void main(String[] args) throws Exception
    {
        JFrame win = new JFrame("Image Demo");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new P095_ImageDemo() );
        win.setVisible(true);
    }


}
