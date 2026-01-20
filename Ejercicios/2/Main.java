
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        // Variable to save the word
        String word = "";

        // We ask for the input
        System.out.print("Insert a word: ");
        word = sc.nextLine();

        // We print out the chars
        System.out.println("\nFirst char: " + word.charAt(0)
                + "\nLast char: " + word.charAt(word.length() - 1));
    }
}
