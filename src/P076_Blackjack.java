import java.util.Random;
import java.util.Scanner;

public class P076_Blackjack {
    public static void main(String[] args) {
        System.out.println("Welcome to Xxxfinty's blackjack program!\n");
        Random random = new Random();
        int deck1 = random.nextInt(10) + 2;
        int deck2 = random.nextInt(10) + 2;
        System.out.println("You drew " + deck1 + " and " + deck2);
        int sum = deck1 + deck2;
        System.out.println("Your total is: " + sum);

        int deck3 = random.nextInt(10) + 2;
        int deck4 = random.nextInt(10) + 2;
        System.out.println("The dealer has a " + deck3 + " showing, and a hidden card.\n" +
                "His total is hidden, too. ");
        int sumd = deck3 + deck4;
        Scanner keyboard = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Would you like to \"hit\" or \"stay\"?: ");
            answer = keyboard.next();
            if ("hit".equals(answer)) {
                int deckn = random.nextInt(10) + 2;
                System.out.println("You drew " + deckn);
                sum = sum + deckn;
                System.out.println("You total is " + sum);

            }
        } while ("hit".equals(answer));
        System.out.println("Okay, dealer's turn.\n" +
                "His hidden card was a " + deck4 + ".\n" +
                "His total was " + sumd + ".");
        int deckm = random.nextInt(10) + 2;
        System.out.println("Dealer chooses to hit.\n" +
                "He draws a " + deckm + ".");
        sumd = sum + deckm;
        System.out.println("His total is " + sumd + ".");
        System.out.println("Dealer stays.");

        System.out.println("Your total is " + sum + ".");
        System.out.println("His total is " + sumd + ".");

        if (sum > sumd) {
            System.out.println("You Won");
        } else {
            System.out.println("You Lost;");
        }
    }
}