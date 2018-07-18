import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 7/10/2018.
 */
public class FunTime {
public static void main( String[] args )
{
    int a1;
    int b2;
    int c3;
    int score=0;

    System.out.println("Q1) What is the capital of Russia?\n" +
            "\t1) Moscow\n" +
            "\t2) Petersburg\n" +
            "\t3) Sochi");

    Scanner scanner = new Scanner(System.in);
    a1 = scanner.nextInt();
    if (a1==1){
        score=score+1;
        System.out.println("Your correct today!");
    } else {
        System.out.println("Your wrong sorry, it's actually 1(Moscow)");
    }

    System.out.println("Q2) What is 1+1=?\n" +
            "\t1) 2\n" +
            "\t2) Window\n");
    b2 = scanner.nextInt();
    if (b2==2 || b2==1){
        score=score+1;
        System.out.println("Your correct today!");
    } else {
        System.out.println("Your wrong sorry, it's actually 2(Window) or 1 (2)");
    }

    System.out.println("Q3 A square has 2 sets of parallel lines exactly?\n" +
            "\t1) Yes\n" +
            "\t2) No\n");
    c3 = scanner.nextInt();
    if (c3==1){
        score=score+1;
        System.out.println("Your correct today!");
    } else {
        System.out.println("Go back to 4th grade,and it's actually 1 (yes)");
    }

    System.out.println("Your score is "+score+"/3");

    if (score<1){
        System.out.println("Boy go back to 3rd, 4th, and 5th grade!");}}}

        