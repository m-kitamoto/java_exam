public class Exam3 {
    public static void main(String[] args) {
        final double tax = 1.1;
        int itemPrice1 = 200;
        int itemPrice2 = 250;
        int totalPrice= itemPrice1 * 3 + itemPrice2 * 4;
        double totalPriceTaxin = totalPrice * tax;
        double totalTax = totalPriceTaxin - totalPrice;
        
        System.out.println("小計\n" + totalPrice + "円");
        System.out.println("消費税\n" + (int)totalTax + "円");
        System.out.println("合計金額\n" + (int)totalPriceTaxin + "円");

    }
}
