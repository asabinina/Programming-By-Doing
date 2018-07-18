import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 7/17/2018.
 */
public class P035_TwoMoreQuestions {

    public static void main(String[] args) {
        String answer;

        System.out.println("Think of an object, and I'll try to guess ");
        System.out.println("    \n" +
                "Question 1) Does it stay inside, outside, or both??");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();

        if (answer.equals("outside")) {
            System.out.println("Is it alive? ");
            answer = scanner.next();

            if (answer.equals("yes")) {
                System.out.println("I think of a articwolf.");
                System.out.println("    If not I don't really care!");
            } else if (answer.equals("no")) {
                System.out.println("I think of a bbq stand.");
                System.out.println("    If not I don't really care!");
            }
        } else if (answer.equals("inside")) {
            System.out.println("Is it alive? ");
            answer = scanner.next();

            if (answer.equals("yes")) {
                System.out.println("I think of a inside plant.");
                System.out.println("    If not I don't really care!");
            } else if (answer.equals("no")) {
                System.out.println("I think of a tv.");
                System.out.println("    If not I don't really care!");

            }
        } else if (answer.equals("both")) {
            System.out.println("Is it alive? ");
            answer = scanner.next();

            if (answer.equals("yes")) {
                System.out.println("I think of a puppy.");
                System.out.println("    If not I don't really care!");
            } else if (answer.equals("no")) {
                System.out.println("I think of a iphone.");
                System.out.println("    If not I don't really care!");


            }
        }
    }

}
