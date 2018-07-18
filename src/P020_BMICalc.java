import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 6/8/2018.
 */
public class P020_BMICalc {
    public static void main(String[] args) {
        double kilograms;
        double height;

        System.out.println("Please awnser these fowling quistions to know your BMI");
        System.out.println("What is your waight in kilograms?");
        Scanner scanner = new Scanner(System.in);
        kilograms = scanner.nextDouble();
        System.out.println("What is your hight in meters");
        height = scanner.nextDouble();
        System.out.println(("Your BMI is ")+kilograms/height/height);
}}
