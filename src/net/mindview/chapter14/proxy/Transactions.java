package net.mindview.chapter14.proxy;

public class Transactions implements Payment {
    @Override
    public void makePayment() {
        System.out.println("You have to specify a specific value of money. Please try again!");
    }

    @Override
    public void makePayment(String s) {
        System.out.println("Making payment now. Payment was written in file. Thank you!");
    }
}
