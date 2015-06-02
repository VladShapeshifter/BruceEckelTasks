package net.mindview.chapter9.animals;

public abstract class RodentImpl implements Rodent {
    protected int height;
    public abstract void gnaw(Meal m);
    public abstract String info();

    RodentImpl(int i) {
        height = i;
    }

    @Override
    public String toString() {
        return info();
    }
}
