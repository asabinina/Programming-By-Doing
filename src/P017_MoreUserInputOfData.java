import java.util.Scanner;

/**
 * Created by Dasha Sabinina on 4/4/2018.
 */
public class P017_MoreUserInputOfData {
        public static void main( String[] args ){
          String  fname;
          String lname;
          int grade;
          int id;
          String login;
          double gpa;
            System.out.println("Please enter the following information so I can sell it for a profit!");
            System.out.println("First name:");
            Scanner scanner = new Scanner(System.in);
            fname=scanner.next();
            System.out.println("Last name:");
            lname=scanner.next();
            System.out.println("Grade (1-12):");
            grade=scanner.nextInt();
            System.out.println("Student ID:");
            id=scanner.nextInt();
            System.out.println("Login:");
            login=scanner.next();
            System.out.println("GPA (0.0-4.0):");
            gpa=scanner.nextDouble();
            System.out.println("Your information:");
            System.out.println("Name: "+fname + " "+lname);
            System.out.println("ID: "+id);
            System.out.println("Login:"+login);
            System.out.println("Grade:"+grade);
            System.out.println("GPA:"+gpa);
            System.out.println("Thank You for your data.");
        }

}
