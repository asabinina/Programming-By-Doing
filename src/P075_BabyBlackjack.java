import java.util.Random;

public class P075_BabyBlackjack {
    public static void main(String[] args) {
        System.out.println("Baby Blackjack!\n");
        Random random = new Random();
        int deck1 = random.nextInt(10) + 1;
        int deck2 = random.nextInt(10) + 1;
        System.out.println("You drew " + deck1 + " and " + deck2);
        int sum = deck1 + deck2;
        System.out.println("Your total is: " + sum);
        int deck3 = random.nextInt(10) + 1;
        int deck4 = random.nextInt(10) + 1;
        System.out.println("The dealer drew " + deck3 + " and " + deck4);
        int sumd = deck3 + deck4;
        System.out.println("The dealer has: " + sumd);
        if (sum > sumd) {
            System.out.println("You Won");
        } else {
            System.out.println("You Lost;");
        }
    }
}