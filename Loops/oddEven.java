package Loops;

public class oddEven {
    public static void main(String[] args) {
    for (int i = 0; i < 18; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + "fizzbuzz");
        } else if(i % 3 == 0) {
            System.out.println(i + "fizz");
        } else if ( i %5 ==0) {
            System.out.println(i + "buzz");

        }
            
        }

    }
    }
    
