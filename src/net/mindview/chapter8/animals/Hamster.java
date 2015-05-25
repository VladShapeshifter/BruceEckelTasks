package net.mindview.chapter8.animals;

class Hamster extends Rodent {
    void gnaw(Meal m) {
        System.out.println("Hamster.gnaw()" + m);
    }
    String info() {
        return "This is Hamster. It's height is " + height + " sm";
    }
    Hamster(int i){
        super(i);
    }
}
