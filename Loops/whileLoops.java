package Loops;

public class whileLoops {
    public static void main(String[] args) {
        double choice = 0.1;
        double guess = 0.99;

        while(guess > choice){
            guess = Math.random();
            System.out.println(guess);
        }
        }
    }
    

