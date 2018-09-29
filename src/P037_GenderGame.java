import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 8/7/2018.
 */
public class P037_GenderGame {
    public static void main(String[] args) {
        int age;
        String M;
        String F;
        String gender;
        String answer;
        String fname;
        String lname;

        System.out.println("What is your gender (M or F):");
        Scanner scanner = new Scanner(System.in);
        gender = scanner.next();
        System.out.println("What is your First name:");
        fname = scanner.next();
        System.out.println("What is your Last name:");
        lname = scanner.next();
        System.out.println("How old are you " + fname + ":");
        age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Then I should call you " + fname + " " + lname + ".");
        } else if (age >= 18) {
            System.out.println("Are you married " + fname + ":");
            answer = scanner.next();

            if (gender.equals("M")) {
                System.out.println("Then I should call you Mr." + lname + ".");
            }
            if (gender.equals("F")) {
                System.out.println("Then I should call you Mrs." + lname + ".");
            }
            if (answer.equals("no || No")) {
                System.out.println("Then I should call you " + fname + " " + lname + ".");


            }


        }
    }
}
