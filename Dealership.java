import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the dealership!");
        System.out.println("select option 'A' to buy a car");
        System.out.println("select option 'B' to sell a car");
        String option = scan.nextLine();

        switch(option){
            case "A": 
            System.out.println("What is your budget?");
            int budget = scan.nextInt();
            if (budget >= 10000) {
                System.out.println("Great a VW is available!");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have a drivers license? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scan.nextInt();
                if(insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                    System.out.println("sold pleasure doing business with you!");
                } else {
                    System.out.println("we're sorry your not eligable for a car");
                }
            } else {
                System.out.println("We dont sell cars under £10,000 sorry");
            }
            break;
            case "B": 
            System.out.println("\nWhat is your car valued at?");
            int value = scan.nextInt();
            System.out.println("\nWhat is your selling price?");
            int price= scan.nextInt();

            if(value > price && price < 30000) {
                System.out.println("We will buy you car for sure! pleasure doing business");
            }else{
                System.out.println("\nsorry your car is to expensive");
            }
            break;
            default: System.out.println("No option selected"); break;
        }
        scan.close();

    }
}
