import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 6/11/2018.
 */
public class P025_HowOldAreYou2 {
    public static void main( String[] args ){
        String name;
        int age;

        System.out.println("Hey what's your name?(Sorry I frogot)");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("So "+name+" how old are you");
        age = scanner.nextInt();
        if (age<16) {
            System.out.println("You can't drive,nor vote "+name);

        }
        else if (age >= 16 && age <= 17) {
            System.out.println("You can drive, but not vote yet"+name);
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("You can't rent a car, but you can vote "+name);
        }
        else if (age>25){
            System.out.println("You can do anything that's legal, "+name);
        }



    }}