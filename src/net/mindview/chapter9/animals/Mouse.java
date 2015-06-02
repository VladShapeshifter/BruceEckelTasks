package net.mindview.chapter9.animals;

class Mouse extends RodentImpl {
    public void gnaw(Meal m) {
        System.out.println("Mouse.gnaw()" + m);
    }
    public String info() {
        return "This is Mouse. It's height is " + height + " sm";
    }
    Mouse(int i){
        super(i);
    }
}