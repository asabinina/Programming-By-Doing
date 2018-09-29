import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 8/7/2018.
 */
public class P040_WorstGuessing {
    public static void main(String[] args) {
        int answer;
        System.out.println("I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS!:");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();

        if (answer != 5) {
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 5!");
        } else {
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 5!");
        }
    }
}
