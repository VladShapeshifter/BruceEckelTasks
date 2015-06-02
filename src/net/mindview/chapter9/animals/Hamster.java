package net.mindview.chapter9.animals;

class Hamster extends RodentImpl {
    public void gnaw(Meal m) {
        System.out.println("Hamster.gnaw()" + m);
    }
    public String info() {
        return "This is Hamster. It's height is " + height + " sm";
    }
    Hamster(int i){
        super(i);
    }
}
