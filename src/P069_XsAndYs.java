public class P069_XsAndYs {
    public static void main(String[] args) {
        System.out.print("x\n" +
                "------" +
                " ");
        for (double x = -10.00; x <= 10; x += 0.5) {
            double y = x * x;
            System.out.println(x + "    " + y);
        }
    }
}
