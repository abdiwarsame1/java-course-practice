package Loops;
import java.util.Scanner;
public class updateSignIn {
    public static void main(String[] args) {
        String username = "abdi";
        String password = "ali";
        Scanner scan = new Scanner(System.in);

        System.out.println("\nwelcome to javagram please sign");
        System.out.print("- username: ");
        String usernameEntry = scan.nextLine();
        System.out.print("- password: ");
        String passwordEntry = scan.nextLine();


        

        while (!usernameEntry.equals(username)|| !passwordEntry.equals(password) ) {
            System.out.println("\nPlease try again");
            System.out.print("- username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- password: ");
            passwordEntry = scan.nextLine();



        }
        System.out.println("\nSuccessful sign in welcome!");
        scan.close();
        
        
    }
    
}
