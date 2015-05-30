package net.mindview.chapter9.animals;

class Mouse extends Rodent {
    void gnaw(Meal m) {
        System.out.println("Mouse.gnaw()" + m);
    }
    String info() {
        return "This is Mouse. It's height is " + height + " sm";
    }
    Mouse(int i){
        super(i);
    }
}