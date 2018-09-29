import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 7/27/2018.
 */
public class P036_BMICategories {
    public static void main(String[] args) {
        double pounds;
        double height;
        double BMI;

        System.out.println("Your height in inches:");
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextDouble();
        System.out.println("Your weight in pounds:");
        pounds = scanner.nextDouble();
        BMI = 703 * pounds/(height * height);

        if (BMI < 18.5) {
            System.out.println("Your BMI is:\n"+BMI +
                    " BMI Category: underweight");


        }

        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Your BMI is:\n" +BMI+
                    "BMI Category: normal");
        }

        else if(BMI > 24.9) {
            System.out.println("Your BMI is:\n" +BMI+
                    "BMI Category: overweight");
        }
    }
}
