import java.util.Random;
import java.util.Scanner;

public class P059_AgainWithTheNumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int myNumber = random.nextInt(10) + 1;
        int answer ;

        System.out.println("I'm thinking of a number from 1 to 10.");

        do {
            System.out.println("Your guess:");
            answer = scanner.nextInt();

            if (answer!=myNumber) {
                System.out.println("That is incorrect. Guess again.");
            }
        }
        while (answer != myNumber);

        System.out.println("That's right! You're a good guesser.");

    }
}

