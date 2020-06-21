import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class P088_RandomRightTriangles extends Canvas
{

    public void paint(Graphics g) {
        Random random = new Random();
        for (int n = 1; n <= 500; n = n + 1) {
            int x1= (random.nextInt(500));
            int x2 =(random.nextInt(500));
            int y1=(random.nextInt(500));
            int y2=(random.nextInt(500));
            Polygon tri = new Polygon();
            tri.addPoint(x1, y1);
            tri.addPoint(x1, y2);
            tri.addPoint(x2, y2);
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            g.fillPolygon(tri);
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Random Right Triangles");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new P088_RandomRightTriangles());
        win.setVisible(true);
    }
}
