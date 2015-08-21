package net.mindview.chapter13;

import java.util.Formatter;

public class Receipt {
    private int width5 = 5;
    private int width10 = width5*2;
    private int width15 = width5*3;
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format("%-" + width15 + "s %" + width5 + "s %" + width10 + "s\n", "Item", "Qty", "Price");
        f.format("%-" + width15 + "s %" + width5 + "s %" + width10 + "s \n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format("%-" + width15 + ".15s %" + width5 + "d %" + width10 + ".2f\n", name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format("%-" + width15 + "s %" + width5 + "s %" + width10 + ".2f\n", "Tax", "", total*0.06);
        f.format("%-" + width15 + "s %" + width5 + "s %" + width10 + "s\n", "", "", "-----");
        f.format("%-" + width15 + "s %" + width5 + "s %" + width10 + ".2f\n", "Total", "", total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
