package net.mindview.chapter8;

public class Tricycle extends Cycle {
    Tricycle() {
        info = "Tricycle object";
        wheelsCount = 3;
    }

    public static void main(String[] args) {
        Tricycle tricycle = new Tricycle();
        tricycle.ride(tricycle);
    }
}
