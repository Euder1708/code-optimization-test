public class AgeValidation {
    public static void main(String[] args) {
         final int age = 18;
        
        if (age >= 18) {
            System.out.println("Access granted");
        }
        
        if (age < 18) {
            System.out.println("Access denied");
        }
    }
}
