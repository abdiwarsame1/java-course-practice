public class logicalOperators {
    public static void main(String[] args) {

        int chemistry = 68;
        int english = 65;
        String language = "java";

        if (chemistry > 75 || english > 75 || language.equals("ava")){
            System.out.println("congrats");
        } else {
            System.out.println("next time insha allah");
        }

        int credit = 40;
        double GPA = 2.0;

        if (credit >= 40 && GPA >= 3.0){
            System.out.println("congrgats again");

        }else{
            System.out.println("need to study harder lad");
        }
    }
    
}
