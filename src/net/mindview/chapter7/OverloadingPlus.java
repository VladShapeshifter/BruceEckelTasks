package net.mindview.chapter7;

public class OverloadingPlus extends Overloading {
    void merry(double d) {
        System.out.println("merry + " + d);
    }

    public static void main(String[] args) {
        OverloadingPlus olp = new OverloadingPlus();
        olp.merry();
        olp.merry("string");
        olp.merry(2);
        olp.merry("string", 2);
        olp.merry(3.14);
    }
}
