import java.util.Random;
import java.util.Scanner;

public class P000_Stem {
    public static void main(String[] args) {
        Random r = new Random();
        String answer;

            System.out.println("Welcome to the game no one knows the answers too?");
        while (true) {
            System.out.println ("Would you like to play?");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.next();
            if (answer.equals("yes")) {
                int choice = 1 + r.nextInt(5);
                String response = "";

                if (choice == 1) {
                    response = "Whats the square root of 4624?";
                    System.out.println("What is the answer to this: " + response);
                    answer = scanner.next();
                    if (answer.equals("68")) {
                        System.out.println("Great job");
                    } else {
                        System.out.println("Better luck next time.");
                    }
                } else if (choice == 2) {
                    response = "What's 83 squared?";
                    System.out.println("What is the answer to this: " + response);
                    answer = scanner.next();
                    if (answer.equals("6889")) {
                        System.out.println("Great job. Your Smart");
                    } else {
                        System.out.println("Better luck next time.");
                    }
                } else if (choice == 3) {
                    response = "If a shape has 4 equal sides but doesn't have any right angles what is it called?";
                    System.out.println("What is the answer to this: " + response);
                    answer = scanner.next();
                    if (answer.equals("rhombus")) {
                        System.out.println("Great job, you still remember 4th grade math.");
                    } else {
                        System.out.println("Better luck next time.");
                    }
                } else if (choice == 4) {
                    response = "what does pi equal too?";
                    System.out.println("What is the answer to this: " + response);
                    answer = scanner.next();
                    if (answer.equals("3.14159265359")) {
                        System.out.println("I am speechless.");
                    } else {
                        System.out.println("Better luck next time.");
                    }
                } else if (choice == 5) {
                    response = "x+92=99.83 what does x equal?";
                    System.out.println("What is the answer to this: " + response);
                    answer = scanner.next();
                    if (answer.equals("7.83")) {
                        System.out.println("Great job");
                    } else {
                        System.out.println("Better luck next time.");
                    }
                }
            } else if (answer.equals("no")) {
                System.out.println("Your no fun, BYE!");
                break;
            }
        }
    }
}