package net.mindview.chapter8;

public class Tricycle extends Cycle {
    public static void ride() {
        System.out.println("Tricycle object.");
    }
    public static void main(String[] args) {
        Cycle cycle = new Tricycle();
        cycle.ride();
        Tricycle tricycle = new Tricycle();
        tricycle.ride();
    }
}
