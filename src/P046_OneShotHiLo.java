import java.util.Random;
import java.util.Scanner;

public class P046_OneShotHiLo {
    public static void main(String[] args) {
        Random random = new Random();
        int rn = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int answer = scanner.nextInt();
        if (answer < rn) {
            System.out.println("Sorry, you are too low. I was thinking of " + rn + ".");
        } else if (answer > rn) {
            System.out.println("Sorry, you are too high. I was thinking of " + rn + ".");
        } else if (answer == rn) {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
