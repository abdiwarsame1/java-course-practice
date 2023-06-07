package Loops;

import java.util.Arrays;

public class referencetrap {
    public static void main(String[] args) {
        
    
    String[] staffLastYear = {"abdi", "ali", "jama"};

    String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
    staffThisYear[1] = "abby";
    System.out.println(Arrays.toString(staffLastYear));
    System.out.println(Arrays.toString(staffThisYear));

}
}



