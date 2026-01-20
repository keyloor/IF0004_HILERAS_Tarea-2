
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We create a scanner for user input
        Scanner sc = new Scanner(System.in);

        //Variable to save the password
        String password = "";

        //We ask for the input
        System.out.print("Insert a password: ");
        password = sc.nextLine();

        System.out.println("Is the password valid? " + validatePassword(password));
        
    }

    public static boolean validatePassword(String password) {

        // The solution I found before knowing about Character.isUpperCase()

        //We validate the ammount of chars first
        // if(password.length() >= 8) {
        //     //Then if it has atleast one upper case letter
        //     String upperCasedPassword = password.toUpperCase();

        //     //We loop the string looking for one
        //     for (int i = 0; i < password.length(); i++) {
        //         if(password.charAt(i) == upperCasedPassword.charAt(i)) {

        //             //We check if the upper cased char is actually a letter and not a number
        //             String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXY"; 
        //             String lowerCase = upperCase.toLowerCase(); 
                        
        //             for (int j = 0; j < password.length(); j++) {

        //                 if(password.charAt(i) == upperCase.charAt(j)) {
        //                     return true;

        //                 } else if(password.charAt(i) == lowerCase.charAt(j)) {
        //                     return true;

        //                 }
        //             }

                    
        //         }
        //     }
        // }

        //return false;

        //Then I investigated and found a solution using Character.isUpperCase()

        //We check for the ammount of chars
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                //We check for an uppercase
                if (Character.isUpperCase(password.charAt(i))) {
                    return true;
                }

            }
        }
    
        return false;

        
    }
}
