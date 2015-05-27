package net.mindview.chapter8.animals;

class Mouse extends Rodent {
    void gnaw(Meal m) {
        System.out.println("Mouse.gnaw()" + m);
    }
    String info() {
        return "This is Mouse. It's height is " + height + " sm";
    }
    Mouse(int i){
        super(i);
        System.out.println("Mouse()");
        Hamster hamster = new Hamster(9);
    }
}
