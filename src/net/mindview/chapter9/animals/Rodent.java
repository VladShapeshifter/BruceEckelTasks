package net.mindview.chapter9.animals;

abstract class Rodent {
    protected int height;
    abstract void gnaw(Meal m);
    abstract String info();

    Rodent(int i) {
        height = i;
    }

    @Override
    public String toString() {
        return info();
    }
}
