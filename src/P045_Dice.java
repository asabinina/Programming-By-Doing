import java.util.Random;

/**
 * Created by Dasha Sabinina on 8/7/2018.
 */
public class P045_Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int DiceRoll1 = random.nextInt(6) + 1;
        int DiceRoll2 = random.nextInt(6) + 1;
        System.out.println("Roll #1: " + DiceRoll1 + "!");
        System.out.println("Roll #2: " + DiceRoll2 + "!");
        int answer = DiceRoll1 + DiceRoll2;
        System.out.println("The total is: " + answer + "!");
    }

}
