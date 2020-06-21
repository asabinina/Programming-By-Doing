import javax.swing.*;
import java.awt.*;
import java.awt.Polygon;

public class P086_BoringTriangle extends Canvas {
    public void paint( Graphics g )
    {
    Polygon tri = new Polygon();
        tri.addPoint(100, 100);
        tri.addPoint(100, 300);
        tri.addPoint(200, 300);
        g.setColor(Color.pink);
        g.fillPolygon(tri);
}
    public static void main(String[] args)
    {
        JFrame win = new JFrame("Boring Triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new P086_BoringTriangle() );
        win.setVisible(true);
    }
}

