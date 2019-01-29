import java.util.Scanner;

public class P062_CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Starting number: ");
        n = scanner.nextInt();
        System.out.print(n+" ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0) {
                n = n * 3 + 1;
            }
            System.out.print(n+" ");
        }
    }
}
