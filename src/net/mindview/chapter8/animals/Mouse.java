package net.mindview.chapter8.animals;

class Mouse extends Rodent {
    void gnaw(Meal m) {
        System.out.println("Mouse.gnaw()" + m);
    }
    String info() {
        return "Mouse with Hamster " + id;
    }
    Mouse(int i){
        super(i);
        System.out.println("Mouse()");
        Hamster hamster = new Hamster(20);
        hamster.addRef();
    }
    private Hamster hamster;
//    protected static long counter = 0;
//    protected final long id = counter++;
    Mouse(Hamster h) {
        System.out.println("Create " + this);
        hamster = h;
        hamster.addRef();
    }
    @Override
    public String toString() {
        return info();
    }
}
