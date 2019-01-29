import java.util.Random;

public class P058_ShorterDoubleDice {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int DiceRoll1;
        int DiceRoll2;
        do {
            DiceRoll1 = random.nextInt(6) + 1;
            DiceRoll2 = random.nextInt(6) + 1;
            System.out.println("Roll #1: " + DiceRoll1 + "!");
            System.out.println("Roll #2: " + DiceRoll2 + "!");
            int answer = DiceRoll1 + DiceRoll2;
            System.out.println("The total is: " + answer + "!");
            Thread.sleep(2000);
        } while (DiceRoll1 != DiceRoll2);
    }
}

