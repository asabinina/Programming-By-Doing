import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 6/11/2018.
 */
public class P026_SpaceBoxing {
    public static void main( String[] args ){
        int weight;
        int p1;
        double p1v=0.78;
        double p2m=0.39;
        double p3j=2.65;
        double p4s=1.17;
        double p5u=1.05;
        double p6n=1.23;
        double newWeight=0;

        System.out.println("Please enter your current weight:");
        Scanner scanner = new Scanner(System.in);
        weight=scanner.nextInt();
        System.out.println("I have information for the following planets:\n" +
                "   1. Venus   2. Mars    3. Jupiter\n" +
                "   4. Saturn  5. Uranus  6. Neptune");
        System.out.println("Which plant are you going on:");

        p1=scanner.nextInt();
        if (p1==1){
            newWeight=p1v*weight;
        }


        if (p1==2){
            newWeight=p2m*weight;
        }


        if (p1==3){
            newWeight=p3j*weight;
        }


        if (p1==4){
            newWeight=p4s*weight;
        }


        if (p1==5){
            newWeight=p5u*weight;
        }


        if (p1==6){
            newWeight=p6n*weight;
        }

        System.out.println("Your weight would be "+newWeight+" pounds on that plant");

}}
