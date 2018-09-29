import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 8/7/2018.
 */
public class P043_NumberGuess {
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.println("Your guess: ");
        Random random = new Random();
        int myNumber = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if (answer == myNumber) {
            System.out.println("That's correct my number was " + myNumber + ".");
        }
            else {
            System.out.println("Sorry, but I was really thinking of " + myNumber + ".");
    }
}}
