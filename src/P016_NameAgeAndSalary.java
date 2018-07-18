import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 4/3/2018.
 */
public class P016_NameAgeAndSalary {
    public static void main( String[] args )
    {
        String name;
        int age;
        double cash;
        System.out.println("Hello.  What is your name?" );
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
       System.out.println("Hi! "+name+", how old are you?");
        age = scanner.nextInt();
        System.out.println("So you're "+age+"? That's not old at all!");
        System.out.println("How much do you make,"+name);
        cash = scanner.nextDouble();
        System.out.println(cash+"!  I hope that's per hour and not per year! LOL!");


    }

}
