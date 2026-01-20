
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        // Variables
        String string = "";
        int vocals = 0;

        // We ask for the input
        System.out.print("Insert a string: ");
        string = sc.nextLine();

        //Just in case upper case was used
        string = string.toLowerCase();

        // We count the vocals
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
                    || string.charAt(i) == 'u') {
                vocals++;
            }
        }

        // We print the amount of vocals
        System.out.println("Vocals: " + vocals);
    }
}
