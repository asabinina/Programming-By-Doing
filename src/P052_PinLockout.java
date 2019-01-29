import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 11/12/2018.
 */
public class P052_PinLockout {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;

        System.out.println("Welcome to the bank f Anna.");
        System.out.print("Please enter your pin: ");
        int entry = keyboard.nextInt();
        tries++;

        while ( entry != pin && tries < 4 )
        {
            System.out.println("\nYou have typed the incorrect pin:");
            System.out.print("Please enter your pin: ");
            switch (entry = keyboard.nextInt()) {
            }
            tries++;
        }

        if ( entry == pin )
            System.out.println("\nPin accepted. You now have access to your account.");
        else if ( tries >= 4 )
            System.out.println("\nYou have ran out of tries. Your account is locked.");
    }
}
