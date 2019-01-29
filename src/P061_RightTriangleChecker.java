import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 12/26/2018.
 */
public class P061_RightTriangleChecker {
    public static void main(String[] args) {
        int side1 = 1;
        int side2 = 2;
        int side3 = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:\n" +
                "Side 1: ");
        side1 = scanner.nextInt();

        do {
            System.out.println("Side 2: ");
            side2 = scanner.nextInt();
            if (side2 < side1) {
                System.out.println(side2 + " is smaller than " + side1);
            }
        }
        while (side2 < side1);


        do {
            System.out.println("Side 3: ");
            side3 = scanner.nextInt();
            if (side3 < side2) {
                System.out.println(side3 + " is smaller than " + side2);
            }

        }
        while (side3 < side2);

        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
        if (side1 * side1 + side2 * side2 == side3 * side3) {
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!\n");
        } else {
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }
}


