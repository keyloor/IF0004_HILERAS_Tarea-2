
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        //Variables to save the strings
        String string1 = "";
        String string2 = "";

        //We ask for the input
        System.out.print("Insert a string: ");
        string1 = sc.nextLine();

        System.out.print("Insert a second string: ");
        string2 = sc.nextLine();

        //We print out the ammount of chars
        System.out.println("\nEquals? " + string1.equalsIgnoreCase(string2));
    }    
}
