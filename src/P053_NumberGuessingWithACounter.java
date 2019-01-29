import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 11/12/2018.
 */
public class P053_NumberGuessingWithACounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int myNumber = random.nextInt(10) + 1;
        int answer = 0;
        int count = 0;

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.println("Your guess:");
        answer = scanner.nextInt();

        while (answer != myNumber) {

            System.out.println("That is incorrect. Guess again.");
            System.out.println("Your guess:");
            answer = scanner.nextInt();
            count = count+1;
        }

        System.out.println("That's right! You're a good guesser.It only took you "+count+" tries!");


    }
}
