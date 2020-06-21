import java.util.Scanner;

public class P067_CountingMachineRevisited {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Count from: ");
        int a1 = scanner.nextInt();
        System.out.println("Count to:");
        int a2 = scanner.nextInt();
        System.out.println("Count by: ");
        int a3 = scanner.nextInt();
        for (int x = a1; x <= a2; x += a3) {
            System.out.println(x);
        }
    }
}
