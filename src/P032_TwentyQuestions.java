import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 7/10/2018.
 */
public class P032_TwentyQuestions {public static void main(String[] args ) {
    String bunny = "animal";
    String turtle = "animal";
    String pin = "mineral";
    String airplane = "mineral";
    String blueberry = "berry";
    String watermelon = "berry";
    String answer;

    System.out.println("Think of an object, and I'll try to guess ");
    System.out.println("    Question 1) Is it a animal, a berry, or a mineral?");
    Scanner scanner = new Scanner(System.in);
    answer=scanner.next();

    if ( answer.equals("animal")) {
        System.out.println("Is this animal bigger than a breadbox? ");
        answer=scanner.next();

        if ( answer.equals("yes")) {
            System.out.println("I think of a turtle.");
            System.out.println("    If not I don't really care!");
        }
            else if ( answer.equals("no")) {
            System.out.println("I think of a bunny.");
            System.out.println("    If not I don't really care!");


        }

    }

    else if ( answer.equals("berry")) {
        System.out.println("Is this berry bigger than a breadbox? ");
        answer=scanner.next();

        if ( answer.equals("yes")) {
            System.out.println("I think of a watermelon.");
            System.out.println("    If not I don't really care!");
        }
        else if ( answer.equals("no")) {
            System.out.println("I think of a blueberry.");
            System.out.println("    If not I don't really care!");


        }

    }

    else if ( answer.equals("mineral")) {
        System.out.println("Is this mineral bigger than a breadbox? ");
        answer=scanner.next();

        if ( answer.equals("yes")) {
            System.out.println("I think of a plane.");
            System.out.println("    If not I don't really care!");
        }
        else if ( answer.equals("no")) {
            System.out.println("I think of a pin.");
            System.out.println("    If not I don't really care!");


        }

    }


}}