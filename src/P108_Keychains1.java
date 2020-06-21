import java.util.Scanner;

public class P108_Keychains1 {
    public static void main(String[] args) {

        int order = 0;

        while (order != 4) {
            System.out.println("1. Add Pineapples to Order");
            System.out.println("2. Remove Pineapples from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Please enter your choice: ");
            order = keyboard.nextInt();

            if (order == 1) {
                add_pineapples();
            }

            if (order == 2) {
                remove_pineapples();
            }

            if (order == 3) {
                view_order();
            }

            if (order == 4) {
                checkout();
            }

        }
    }
    //add_keychains(), remove_keychains(), view_order() and checkout()
    public static void add_pineapples(){
        System.out.println("Add Pineapples");
    }

    public static void remove_pineapples(){
        System.out.println("Removed a Pineapple");
    }

    public static void view_order(){
        System.out.println("View Order");
    }

    public static void checkout(){
        System.out.println("Checkout");
    }




}
