package net.mindview.chapter8;

public class Bicycle extends Cycle {
    public static void ride() {
        System.out.println("Bicycle object.");
    }
    public static void main(String[] args) {
        Cycle cycle = new Bicycle();
        cycle.ride();
    }
}
