package net.mindview.chapter8.shared;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(Boolean checkedOut) {
        System.out.println("Create " + this);
    }
    public void addRef() {
        refcount++;
    }
    protected void dispose() throws Throwable {
//        finalize();
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }
    @Override
    public String toString() {
        return "Shared " + id;
    }

    @Override
    public void finalize() throws Throwable {
        if (refcount != 0) {
            System.out.println(this + " is ready to clean memory.");
        }
    }
}
