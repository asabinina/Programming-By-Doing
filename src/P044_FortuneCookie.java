import java.util.Random;

public class P044_FortuneCookie {
    public static void main(String[] args) {

        Random random = new Random();
        int choice = random.nextInt(6) + 1;
        String response = "";
        if ( choice == 1 )
            response = "You will live long";
        else if ( choice == 2 )
            response = "You will have a happy family";
        else if ( choice == 3 )
            response = "Your live is going to be happy";
        else if ( choice == 4 )
            response = "Stick with what you have";
        else if ( choice == 5 )
            response = "You will find happiness with a new love";
        else if ( choice == 6 )
            response = "You will be a will be rich soon";
        System.out.println ("Fortune Cookie Says: "+ response );
}}
