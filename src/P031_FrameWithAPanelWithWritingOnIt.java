import javax.swing.*;
import java.awt.*;

/**
 * Created by Dasha Sabinina on 6/22/2018.
 */
public class P031_FrameWithAPanelWithWritingOnIt {
    public static void main(String[] args) {
        Frame613 f = new Frame613();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    static class Frame613 extends JFrame
    {public Frame613()
    {
        setTitle("613 rocks!");
        setSize(300,200);
        setLocation(100,200);

        Panel613 panel=new Panel613();
        Container cp=getContentPane();
        cp.add(panel);
    }
    }

    static class Panel613 extends JPanel
    {public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Hello. I am Anna your computer helper." +
                "1.Turn off the screen" +
                "2.and go do what your mom said to do" +
                "3.G.S.D :)",75,100);
    }
    }
}
