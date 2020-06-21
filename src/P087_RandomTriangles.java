import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class P087_RandomTriangles extends Canvas {
        public void paint( Graphics g )
        {
            Random random = new Random();
            for (int n = 1; n <= 500; n = n + 1) {
                Polygon tri = new Polygon();
                tri.addPoint(random.nextInt(500), random.nextInt(500));
                tri.addPoint( random.nextInt(500), random.nextInt(500));
                tri.addPoint(random.nextInt(500), random.nextInt(500));
                g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                g.fillPolygon(tri);
            }
            }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Random Triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new P087_RandomTriangles());
        win.setVisible(true);
    }
}
