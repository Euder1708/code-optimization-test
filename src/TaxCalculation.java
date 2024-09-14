public class TaxCalculation {
    public static void main(String[] args) {
        double []  productPrice = {100,200};
        double [] porcentage = {0.10, 0.15};
      final int  TAX_THRESHOLD = 50;

        double totalTax = 0;
        for (int i = 0; i< productPrice.length; i++){
            totalTax += (productPrice[i]*porcentage[i]);
        }
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
