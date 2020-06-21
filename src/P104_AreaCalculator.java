import java.util.Scanner;

public class P104_AreaCalculator {
    public static double area_circle( int radius ){return radius*radius*Math.PI;}
    public static int area_rectangle( int length, int width )  {return length*width;}
    public static int area_square( int side )  {return side*side;}
    public static double area_triangle( int base, int height ){return base*height*0.5;}
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("1) Triangle\n" +
                    "2) Rectangle\n" +
                    "3) Square\n" +
                    "4) Circle\n" +
                    "5) Quit");
            int shape = keyboard.nextInt();

            if (shape == 1) {
                System.out.println("Base: ");
                int b = keyboard.nextInt();
                System.out.println("height: ");
                int h = keyboard.nextInt();
                System.out.println("The Area is:  " + area_triangle(b, h));
            }
            if (shape == 2) {
                System.out.println("Length: ");
                int l = keyboard.nextInt();
                System.out.println("Width: ");
                int w = keyboard.nextInt();
                System.out.println("The Area is:  " + area_rectangle(l, w));
            }
            if (shape == 3) {
                System.out.println("Side Length: ");
                int l = keyboard.nextInt();
                System.out.println("The Area is:  " + area_square(l));
            }
            if (shape == 4) {
                System.out.println("Radius: ");
                int r = keyboard.nextInt();
                System.out.println("The Area is:  " + area_circle(r));
            }
            if (shape == 5) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}
