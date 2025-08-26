// Author: Jerald Huang
// Date: 2025-08-26

public class Receipt {
    public static void main(String[] args) {
        // Items and prices
        String item1 = "Chicken Alfredo";
        double price1 = 15.20;

        String item2 = "Taro Milk Tea";
        double price2 = 9.25;

        String item3 = "Chips";
        double price3 = 0.90;

        // Print receipt
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("*   Jerald's lunch                     *");
        System.out.println("*                                      *");
        System.out.println("*   " + item1 + " ......... $" + price1 + "    *");
        System.out.println("*   " + item2 + " ........... $" + price2 + "    *");
        System.out.println("*   " + item3 + " ................... $" + price3 + "0    *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
    }
}