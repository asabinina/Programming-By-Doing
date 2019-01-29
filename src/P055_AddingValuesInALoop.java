import java.util.Scanner;

public class P055_AddingValuesInALoop {
    public static void main(String[] args) throws Exception {
        int output=0;
        int input= -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.( don't forget a zero)");

       while (input != 0) {
           System.out.println("Number:");
           input = scanner.nextInt();
           output+=input;
           System.out.println("The total is so far "+output);
    }
}}
