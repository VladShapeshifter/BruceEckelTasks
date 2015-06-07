package net.mindview.chapter9.bicycles;

public class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getBike() {
        return new Unicycle();
    }
}
