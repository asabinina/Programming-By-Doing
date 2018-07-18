import javax.swing.*;

/**
 * Created by Dasha Sabinina on 6/15/2018.
 */
public class P029_UsingSwingForInput {
    public static void main( String[] args ){
        String name= JOptionPane.showInputDialog("What is your name?");
        String input=JOptionPane.showInputDialog("How old are you?");
        int age= Integer.parseInt(input);
        System.out.println("Hello, "+name+".");
        System.out.println("Next year "+name+" you will be "+(age+1));
}}
