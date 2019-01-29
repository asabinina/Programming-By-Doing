import java.util.Scanner;

public class P060_SafeSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number=-0;
        double answer=0;
        System.out.println("SQUARE ROOT!\n" +
                "Enter a number:");
        number = scanner.nextInt();
        answer=Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + answer);
    }
}
