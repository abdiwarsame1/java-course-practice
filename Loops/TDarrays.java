package Loops;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = {
                { 20, 30, 40, 50 },
                { 60, 70, 80, 90 },
                { 100, 110, 120, 130 },

        };

        for (int i = 0; i < grades.length; i++) {

            switch (i) {
                case 0:
                    System.out.print("\tAbdi: ");
                    break;
                case 1:
                    System.out.print("\tAli: ");
                    break;
                case 2:
                    System.out.print("\tLoco: ");
                    break;

            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
