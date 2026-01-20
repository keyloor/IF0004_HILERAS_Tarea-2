
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        //Variable to save the string
        String string = "";

        //We ask for the input
        System.out.print("Insert a string: ");
        string = sc.nextLine();

        //We invert the string
        String inverted = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            //We use concatenation
            inverted += string.charAt(i);
        }

        //We show the inverted string
        System.out.println("Inverted: " + inverted);
        
    }    
}
