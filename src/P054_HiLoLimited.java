import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 11/12/2018.
 */
public class P054_HiLoLimited {
    public static void main(String[] args) {
        Random random = new Random();
        int rn = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.You have 7 tries");
        for (int i=1; i<=7; i++) {
            System.out.println("Guess #"+i+":");
            int answer = scanner.nextInt();
            if (answer < rn) {
                System.out.println("Sorry, you are too low, try again.");
            } else if (answer > rn) {
                System.out.println("Sorry, you are too high,try again.");
            } else if (answer == rn) {
                System.out.println("You guessed it!  What are the odds?!?");
                return;
            }
        }
        System.out.println("Sorry, you didn't guess it in 7 tries. You lost");
    }
}

