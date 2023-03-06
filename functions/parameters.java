package functions;

public class parameters {
    public static void main(String[] args) {
        calculateArea (2.6 , 3.6);
        calculateArea (0.6 , 0.6);
    }

    public static void calculateArea(double width, double length) {
        double area = width * length;
        System.out.println("area:" + area);
        
    }
    
}
