import java.util.Scanner;

public class P074_AddingValuesForLoop {
    public static void main(String[] args) {
        int sum=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        int n = keyboard.nextInt();
        for (int number = 0; number <= n; number++) {
            sum=sum+number;
            System.out.print("" + number +" ");
        }
        System.out.println();
        System.out.println("The sum is: "+ sum);
    }
}
