package functions;

public class weather {
    public static void main(String[] args) {

        double noon = 77;         
        double evening = 61;       
        double midnight = 55;

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }

    public static double degreeToCelsius(double degree) {
        return (degree - 32) * 5 / 9;
    }
    
    public static void printTemperatures(double degree) {
        System.out.println("F: " + degree);
        System.out.println("C: " + degreeToCelsius(degree) +"\n");
    }
}
