import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 7/17/2018.
 */
public class P033_Adventure1 {
    public static void main(String[] args) {
        String answer;

        System.out.println("You are in a creepy old house! Would you like to go into the kitchen or upstairs?");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();

        if (answer.equals("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\". ");
            answer = scanner.next();

            if (answer.equals("cabinet")) {
                System.out.println("You see a huge tarantula, then you die because the tarantula bit you " +
                        "so hard that all of it's venom came out and into your body. ");

            } else if (answer.equals("refrigerator")) {
                System.out.println("You see food and drugs would you like to eat the food.");
                answer = scanner.next();

                if (answer.equals("yes")) {
                    System.out.println("First off all gross, that food sat there since 1890" +
                            " and plus you also die:)");

                    if (answer.equals("no")) {

                        System.out.println("You die of starvation... eventually.");


                    }

                }
            }
        } else if (answer.equals("upstairs")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            answer = scanner.next();

            if (answer.equals("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\"). ");


                answer = scanner.next();
                if (answer.equals("yes")) {
                    System.out.println("There is $100000000000000000000000000000000000000000000000000000000000" +
                            "you took them and you just became the richest person on earth");
                } else if (answer.equals("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
            } else if (answer.equals("bathroom")) {
                System.out.println("There is a toilet would you like to use it.");

                answer = scanner.next();
                if (answer.equals("no")) {
                    System.out.println("you died in 48 hours because you had too much stuff in your body.");
                } else if (answer.equals("yes")) {
                    System.out.println("After you flush a slimey hand comes out with a Knife and kills you");
                }
            }
        }
    }
}