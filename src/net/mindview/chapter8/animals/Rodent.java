package net.mindview.chapter8.animals;

class Rodent {
    protected int height;
    void gnaw(Meal m) {
        System.out.println("Rodent.gnaw()" + m);
    }
    String info() {
        return "This is Rodent. It's height is " + height + " sm";
    }
    Rodent() {}
    Rodent(int i) {
        height = i;
    }

    @Override
    public String toString() {
        return info();
    }
}
