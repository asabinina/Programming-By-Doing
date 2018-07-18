import java.util.Scanner;

public class P015_ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Give me a word!");
         keyboard.next();

        System.out.print("Give me a second word!");
         keyboard.next();

        System.out.print("Give me a digit!");
         keyboard.nextInt();

        System.out.print("Give me a second digit!");
         keyboard.nextInt();

        System.out.println( "Whew!  Wasn't that fun?" );
    }
}
