package Loops;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {

        int number = 4;
        System.out.println("I choose a number between 1 and 5 try to guess it: 1");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while(guess != number){
            System.out.println("guess again");
             guess = scan.nextInt();
        }
        System.out.println("well done you got it");
        scan.close();
        
    }
    
}
