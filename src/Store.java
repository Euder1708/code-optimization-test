public class Store {
    public static void main(String[] args) {

        int[] price = { 15, 10, 5 };
        final int METER = 50;
        int[] amount = { 2, 3, 4 };

        int totalSales = 0;

        for (int i = 0; i < price.length; i++) {
            totalSales += (price[i] * amount[i]);
        }
        if (totalSales > METER)

        {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
