import java.util.Scanner;

public class P014_AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int feet,inches;

        int age;
        double weight;

        System.out.print( "How old are you? " );
        age = keyboard.nextInt();

        System.out.print( "How many feet are you? " );
        feet = keyboard.nextInt();

        System.out.print( "And in inches what is your length? " );
        inches = keyboard.nextInt();

        System.out.print( "How much do you weigh? " );
        weight = keyboard.nextDouble();

        System.out.println( "So you're " + age + " years old, " + feet+"'"+ inches + "\" tall and " + weight + " lbs heavy." );
    }
}