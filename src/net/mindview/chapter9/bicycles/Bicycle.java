package net.mindview.chapter9.bicycles;

public class Bicycle implements Cycle {
    int wheels = 2;
    @Override
    public void move() {
        System.out.println("Moving on " + wheels + " wheel(s)");
    }
}
