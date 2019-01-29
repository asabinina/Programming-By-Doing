import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 10/5/2018.
 */
public class P047_ThreeCardMonte {
    public static void main(String[] args) {
        Random random = new Random();
        int ace = random.nextInt(3) + 1;
        System.out.println("You slide up to Fast Anna's card table and plop down your cash.\n" +
                "She glances at you out of the corner of her eye and starts shuffling.\n" +
                "She lays down three cards.");

        System.out.println("Which one is the ace?\n" +
                "\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        if (guess != ace) {
            System.out.println("Ha! Fast Anna wins again! The ace was card number " + ace + ".");

        } else if (guess == ace) {
            System.out.println("You nailed it! Fast Anna reluctantly hands over your winnings, scowling. ");

        }
    }
}
