import java.util.Scanner;

public class P065_CountingMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        keyboard.nextLine();
        int n = 1;
        for (int number = 0; number < n; n++) {
            System.out.println(n+", "+number);
        }

    }
}
