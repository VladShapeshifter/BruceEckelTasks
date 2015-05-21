package net.mindview.chapter8;

public class Unicycle extends Cycle {
    public static void ride() {
        System.out.println("Unicycle object.");
    }

    public static void main(String[] args) {
        Cycle cycle = new Unicycle();
        cycle.ride();
    }
}
