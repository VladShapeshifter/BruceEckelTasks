package net.mindview.chapter5;

public class Finalize {
    public void finalize() {
        System.out.println("This is finalize method!");
    }

    public static void main(String[] args) {
        Finalize finalize = new Finalize();
        finalize = null;
        System.gc();

    }
}
