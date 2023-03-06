import java.util.Scanner;

public class SignUp {
    
    public static void main(String[] args) {
        
        System.out.println("Thanks for taking the survey");

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your first name?");
        String firstname = scanner.nextLine();

        System.out.println("what is yout last name?");
        String lastname = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("make a username");
        String username = scanner.nextLine();

        System.out.println("what city do you live in?");
        String city = scanner.nextLine();

        System.out.println("what country is that?");
        String country = scanner.nextLine();


        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " +firstname);
        System.out.println("\tLast Name: " + lastname);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        scanner.close();





        
    }
    
}
