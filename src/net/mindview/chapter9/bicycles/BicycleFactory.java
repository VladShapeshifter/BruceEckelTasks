package net.mindview.chapter9.bicycles;

public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getBike() {
        return new Bicycle();
    }
}
