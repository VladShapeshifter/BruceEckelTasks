package net.mindview.chapter8.shared;

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Create " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() throws Throwable {
        shared.finalize();
        System.out.println("Disposing " + this);
        shared.dispose();
    }
    @Override
    public String toString() {
        return "Composing " + id;
    }
    /*@Override
    protected void finalize() throws Throwable {
        if (refcount != 0) {
            System.out.println(this + " is ready to clean memory.");
        }
    }*/

}
