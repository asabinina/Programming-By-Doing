import java.util.Scanner;

public class P103_WeekdayCalculator {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12,10,2003));
        System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
        System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
        System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
        System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
        System.out.println("10 13 2000 => " + weekday(10,13,2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

        // put a function call for weekday() here
        System.out.println("You were born on "+weekday(mm,dd,yyyy));
    }


    public static String weekday( int mm, int dd, int yyyy )
    {
        int yy, total;
        yy=yyyy-1900;
        total=yy/4;
        total=yy+total;
        total=dd+total;
        total=P102_MonthOffset.month_offset(mm)+total;
        if (is_leap(yyyy)) {
            if (mm==1 || mm==2)
                total=total-1;
        }
        total=total%7;


        String date = weekday_name(total) +" "+ month_name(mm)+" " +dd+ ", " + yyyy;
        // bunch of calculations go here

        return date;
    }

    private static String weekday_name(int day) {

        if (day == 1) {
            return "Sunday";
        }
        if (day == 2) {
            return "Monday";
        }
        if (day == 3) {
            return "Tuesday";
        }
        if (day == 4) {
            return "Wednesday";
        }
        if (day == 5) {
            return "Thursday";
        }
        if (day == 6) {
            return "Friday";
        }
        if (day == 0) {
            return "Saturday";
        }

        return "Not A month enter posible number";
    }

    private static String month_name(int month) {

        if (month == 1) {
            return "Janury";
        }
        if (month == 2) {
            return "Febuary";
        }
        if (month == 3) {
            return "March";
        }
        if (month == 4) {
            return "April";
        }
        if (month == 5) {
            return "May";
        }
        if (month == 6) {
            return "June";
        }
        if (month == 7) {
            return "July";
        }
        if (month == 8) {
            return "Agust";
        }
        if (month == 9) {
            return "September";
        }
        if (month == 10) {
            return "October";
        }
        if (month == 11) {
            return "Noveber";
        }
        if (month == 12) {
            return "December";
        }
        return "Not A month enter posible number";
    }


    // paste your functions from MonthName, WeekdayName, and MonthOffset here

    public static boolean is_leap( int year )
    {
        // years which are evenly divisible by 4 are leap years,
        // but years divisible by 100 are not leap years,
        // though years divisible by 400 are leap years
        boolean result;

        if ( year%400 == 0 )
            result = true;
        else if ( year%100 == 0 )
            result = false;
        else if ( year%4 == 0 )
            result = true;
        else
            result = false;

        return result;
    }
}
