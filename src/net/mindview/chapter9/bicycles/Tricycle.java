package net.mindview.chapter9.bicycles;

public class Tricycle implements Cycle {
    int wheels = 3;
    @Override
    public void move() {
        System.out.println("Moving on " + wheels + " wheel(s)");
    }
}
