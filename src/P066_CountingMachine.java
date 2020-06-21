import java.util.Scanner;

public class P066_CountingMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        int n = keyboard.nextInt();
        for (int number = 0; number < n; number++) {
            System.out.println(n+", "+number);
        }

    }
}
