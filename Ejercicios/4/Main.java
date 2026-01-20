
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        //Variable to save the phrase
        String phrase = "";

        //We ask for the input
        System.out.print("Insert a phrase: ");
        phrase = sc.nextLine();

        //We print out the phrase
        System.out.println("\nNormal: " + phrase + "\nUpperCase: " + phrase.toUpperCase() + "\nLowerCase: " + phrase.toLowerCase());
    }
}
