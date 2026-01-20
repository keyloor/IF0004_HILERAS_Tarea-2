import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        //Variable to save the strings
        String string1 = "";
        String string2 = "";

        //We ask for the input
        System.out.print("Insert the first string: ");
        string1 = sc.nextLine();

        System.out.print("Insert the second string: ");
        string2 = sc.nextLine();

        //We print out if they are equal
        System.out.println("\nEquals? " + string1.equalsIgnoreCase(string2));

    }    
}
