package net.mindview.chapter9.bicycles;

public class Unicycle implements Cycle {
    int wheels = 1;
    @Override
    public void move() {
        System.out.println("Moving on " + wheels + " wheel(s)");
    }
}
