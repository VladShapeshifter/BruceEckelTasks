package net.mindview.chapter8.animals;

class Rodent {
    protected int height;
    protected static long counter = 0;
    protected final long id = counter++;
    void gnaw(Meal m) {
        System.out.println("Rodent.gnaw()" + m);
    }
    String info() {
        return "Rodent " + id;
    }
    Rodent() {}
    Rodent(Hamster h) {}
    Rodent(int i) {
        height = i;
        System.out.println("Rodent()");
    }

    @Override
    public String toString() {
        return info();
    }
}
