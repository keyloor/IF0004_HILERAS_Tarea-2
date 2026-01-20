
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        //Variables
        String phrase = "";
        String word = "";

        //We ask for the input
        System.out.print("Insert a phrase: ");
        phrase = sc.nextLine();

        System.out.print("Insert a word: ");
        word = sc.nextLine();

        //We print out if the word is inside the phrase
        System.out.println("\nIs the word inside the phrase? " + phrase.contains(word));
    }
}
