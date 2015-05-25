package net.mindview.chapter8.animals;

class Beaver extends Rodent {
    void gnaw(Meal m) {
        System.out.println("Beaver.gnaw()" + m);
    }
    String info() {
        return "This is Beaver. It's height is " + height + " sm";
    }
    Beaver(int i){
        super(i);
    }
}
