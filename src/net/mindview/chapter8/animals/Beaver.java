package net.mindview.chapter8.animals;

class Beaver extends Rodent {
    void gnaw(Meal m) {
        System.out.println("Beaver.gnaw()" + m);
    }
    String info() {
        return "Beaver with Hamster " + id;
    }
    Beaver(int i){
        super(i);
        System.out.println("Beaver()");
        Hamster hamster = new Hamster(20);
        hamster.addRef();
    }
//    protected static long counter = 0;
//    protected final long id = counter++;
    private Hamster hamster;
    Beaver(Hamster h) {
        System.out.println("Create " + this);
        hamster = h;
        hamster.addRef();
    }

    @Override
    public String toString() {
        return info();
    }
}
