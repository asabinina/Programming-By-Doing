import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 6/11/2018.
 */
public class P022_HowOldAreYou {
    public static void main( String[] args ){
        String name;
        int age;

        System.out.println("Hey what's your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("So "+name+" how old are you");
        age = scanner.nextInt();
        if (age<16) {
            System.out.println("You can't drive, "+name);

        }
        if (age<18) {
            System.out.println("You can't smoke or drink in U.S.A, "+name);
        }
        if (age<25) {
            System.out.println("You can't rent a car, "+name);
        }
        if (age>25){
            System.out.println("You can do anything that's legal, "+name);
        }



    }}
