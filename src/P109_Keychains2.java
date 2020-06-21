import java.util.Scanner;

public class P109_Keychains2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int order = 0, friends = 0;

        while (order != 4) {
            System.out.println("1. Add Friends to Order");
            System.out.println("2. Remove Friends from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");

            System.out.println("Please enter your choice: ");
            order = keyboard.nextInt();

            if (order == 1) {
                friends = add_friends(friends, keyboard);
            }

            if (order == 2) {
                friends = remove_friends(friends, keyboard);
            }

            if (order == 3) {
                friends = view_order(friends);
            }

            if (order == 4) {
               checkout(friends, keyboard);
            }
        }
    }

    public static int add_friends(int friends, Scanner keyboard) {
        System.out.println("You have " + friends + " friends. How many would you like to add?");
        friends = friends + keyboard.nextInt();
        System.out.println("You now have "+ friends + " friends.");
        return friends;
    }

    public static int remove_friends(int friends, Scanner keyboard) {
        System.out.println("You have " + friends + " friends. How many would you like to remove?");
        friends = friends - keyboard.nextInt();
        System.out.println("You now have "+ friends + " friends.");
        return friends;
    }

    public static int view_order(int friends) {
        System.out.println("You have " + friends + " friends.");
        System.out.println("A human costs $8 million each.");
        System.out.println("Your cost is $"+friends*8000000/1000000+" million");
        return friends;
    }

    public static void checkout(int friends, Scanner keyboard) {
        System.out.println("Checkout:");
        System.out.println("What is your name? ");
        String name = keyboard.next();
        System.out.println("You have " + friends + " friends.");
        System.out.println("A human costs $8 million each.");
        System.out.println("Your cost is $"+friends*8000000/1000000+" million.");
        System.out.println("Thank You for you order, "+name+"!");
    }
}