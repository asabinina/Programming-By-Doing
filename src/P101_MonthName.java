public class P101_MonthName {
    public static String month_name(int month) {
        // Your code goes in here.
        if (month == 1) {
            return "January";
        }
        if (month == 2) {
            return "No one likes you";
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
            return "Its loud";
        }
        if (month == 8) {
            return "So hot";
        }
        if (month == 9) {
            return "Hell starts";
        }
        if (month == 10) {
            return "Halloween";
        }
        if (month == 11) {
            return "Turkey";
        }
        if (month==12){
            return "Christmas";
        }
        return "";
    }


    public static void main(String[] args) {
        System.out.println("Month 1: " + month_name(1));
        System.out.println("Month 2: " + month_name(2));
        System.out.println("Month 3: " + month_name(3));
        System.out.println("Month 4: " + month_name(4));
        System.out.println("Month 5: " + month_name(5));
        System.out.println("Month 6: " + month_name(6));
        System.out.println("Month 7: " + month_name(7));
        System.out.println("Month 8: " + month_name(8));
        System.out.println("Month 9: " + month_name(9));
        System.out.println("Month 10: " + month_name(10));
        System.out.println("Month 11: " + month_name(11));
        System.out.println("Month 12: " + month_name(12));
        System.out.println("Month 43: " + month_name(43));
    }
}
