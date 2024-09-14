public class Store {
    public static void main(String[] args) {
        int precio1 = 15;
        int precio2 = 10;
        int precio3 = 5;
        int ventasEstandar=50;

        int total1 = precio1 * 2;
        int total2 = precio2 * 3;
        int total3 = precio3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > ventasEstandar) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
