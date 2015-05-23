package net.mindview.chapter8;

public class Bicycle extends Cycle {
    Bicycle() {
        info = "Bicycle object";
        wheelsCount = 2;
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.ride(bicycle);
    }
}
