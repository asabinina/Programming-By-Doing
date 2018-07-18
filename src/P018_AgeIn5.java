import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 6/8/2018.
 */
public class P018_AgeIn5 {
    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello," + name);
        System.out.println("How old are you?");
        age = scanner.nextInt();
        System.out.println("In 5 years you will be " + (age + 5) + " and 5 years ago you were " + (age - 5));
    }
}
