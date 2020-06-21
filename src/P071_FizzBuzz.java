public class P071_FizzBuzz {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                if (x % 5 == 0)
                    System.out.println("fizzbuzz");
                else
                    System.out.println("fizz");

            } else if (x % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}
