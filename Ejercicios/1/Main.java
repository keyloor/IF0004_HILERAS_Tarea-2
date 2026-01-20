import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        //Variable to save the strings
        String string = "";
        
        //We ask for the input
        System.out.print("Insert the string: ");
        string = sc.nextLine();


        //We print out if they are equal
        System.out.println("\nAmmount of chars: " + string.length());

    }    
}
