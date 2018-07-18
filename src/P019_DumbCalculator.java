import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 6/8/2018.
 */
public class P019_DumbCalculator {

    public static void main(String[] args) {
        int firstnumb;
        int secondnumb;
        int thirdnumb;
        System.out.println("What is your first number?");
        Scanner scanner = new Scanner(System.in);
        firstnumb = scanner.nextInt();
        System.out.println("What is your second number?");
        secondnumb = scanner.nextInt();
        System.out.println("What is your third number?");
        thirdnumb = scanner.nextInt();
        System.out.println("("+firstnumb+"+"+secondnumb+"+"+thirdnumb+") Is..."+(firstnumb+secondnumb+thirdnumb)/2);



}}
