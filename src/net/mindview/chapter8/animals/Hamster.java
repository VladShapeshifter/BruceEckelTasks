package net.mindview.chapter8.animals;

class Hamster {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    int height;
    public void addRef() {
        refcount++;
    }
    String name;
    Hamster(int i){
        height = i;
        System.out.print(this + " height is " + height);
    }
    Hamster() {
        System.out.println("General Hamster was created");
    }

    @Override
    public String toString() {
        return "Hamster " + id;
    }
}
