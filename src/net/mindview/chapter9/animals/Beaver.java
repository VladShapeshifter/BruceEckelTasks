package net.mindview.chapter9.animals;

class Beaver extends RodentImpl {
    public void gnaw(Meal m) {
        System.out.println("Beaver.gnaw()" + m);
    }
    public String info() {
        return "This is Beaver. It's height is " + height + " sm";
    }
    Beaver(int i){
        super(i);
    }
}