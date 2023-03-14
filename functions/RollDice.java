package functions;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 = Rolldice();
        int roll2 = Rolldice();
        int roll3 = Rolldice();
        
        System.out.println("Choose three numbers between 1-6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than one. Exitting game");
            System.exit(0);
        }

        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannot be greater than 6. Exitting game");
            System.exit(0);
        }

        int sumOfNumbers = num1+num2+num3;
        int sumOfDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice sum = " + sumOfDiceRolls + " . Number sum = " + sumOfNumbers);

        if (checkWin(sumOfDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats you win!!");
        } else {
            System.out.println("sorry you lose");
        }

        scan.close();
    }

    public static int Rolldice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
        
    }

    public static boolean checkWin(int sumOfDiceRolls, int sumOfNumbers) {
        return (sumOfNumbers > sumOfDiceRolls && sumOfDiceRolls - sumOfDiceRolls < 3);
        
    }
    
}
