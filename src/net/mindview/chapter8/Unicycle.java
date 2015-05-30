package net.mindview.chapter8;

public class Unicycle extends Cycle {
    Unicycle() {
        info = "Unicycle object";
        wheelsCount = 1;
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        unicycle.ride(unicycle);
    }
    void balance() {
        System.out.println("Unicycle.balance()");
    }
}
