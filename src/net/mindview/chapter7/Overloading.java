package net.mindview.chapter7;

public class Overloading {
    void merry() {
        System.out.println("just merry");
    }
    void merry(String s) {
        System.out.println("merry + " + s);
    }
    void merry(int i) {
        System.out.println("merry + " + i);
    }
    void merry(String s, int i) {
        System.out.println("merry + " + s + " + " + i);
    }
}
