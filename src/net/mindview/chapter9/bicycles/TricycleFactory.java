package net.mindview.chapter9.bicycles;

public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getBike() {
        return new Tricycle();
    }
}
